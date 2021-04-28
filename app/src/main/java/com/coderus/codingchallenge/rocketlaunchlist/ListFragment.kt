package com.coderus.codingchallenge.rocketlaunchlist

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.coderus.codingchallenge.R
import com.coderus.codingchallenge.databinding.FragmentListBinding
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.objectmodel.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Fragment to display the list of Rocket Launches.
 */
@AndroidEntryPoint
class ListFragment : Fragment(R.layout.fragment_list) {

    private val viewModel: ListViewModel by viewModels()

    private var _binding: FragmentListBinding? = null

    private val binding: FragmentListBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupList()
        binding.retryButton.setOnClickListener() {
            retryOnClick()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupList() {
        RocketLaunchListAdapter(requireContext(), listener).apply {
            binding.rocketLaunchList.adapter = this
            binding.rocketLaunchList.addItemDecoration(ListItemDecoration(20))

            viewModel.results.observe(viewLifecycleOwner, Observer { newValue ->
                binding.progressBar.visibility = GONE

                if (newValue.data == null || newValue.data.isEmpty() || newValue.status == Status.ERROR) {
                    binding.retryButton.visibility = VISIBLE
                    presentError(newValue.message)
                    return@Observer
                }

                if (newValue.status == Status.SUCCESS) {
                    var list = newValue.data
                    list = list.sortedWith(compareByDescending { it.dateInstant() })
                    update(list)
                }
            })
        }
        retrieveData()
    }

    private val listener = View.OnClickListener {
        (it as ListItemView).apply {
            showDetail(it.launch)
        }
    }

    private fun showDetail(launch: RocketLaunch?) {
        val bundle = bundleOf("launch" to launch)
        view?.let { Navigation.findNavController(it).navigate(R.id.action_to_detailFragment, bundle) }
    }

    private fun retrieveData() {
        GlobalScope.launch(Dispatchers.Main.immediate) {
            binding.retryButton.visibility = GONE
            binding.progressBar.visibility = VISIBLE
        }
        viewModel.retrieveData()
    }

    private fun presentError(msg: String?) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Error")

        builder.setMessage(msg ?: getString(R.string.error_generic))
        builder.setNeutralButton("OK", null)

        val dialog: AlertDialog = builder.create()

        GlobalScope.launch(Dispatchers.Main.immediate) {
            dialog.show()
        }
    }

    private fun retryOnClick() {
        retrieveData()
    }
}
