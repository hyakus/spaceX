package com.coderus.codingchallenge.rocketlaunchdetail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.navArgs
import com.coderus.codingchallenge.R
import com.coderus.codingchallenge.databinding.FragmentDetailBinding
import com.coderus.codingchallenge.databinding.FragmentListBinding
import com.coderus.codingchallenge.objectmodel.LaunchStatus
import com.coderus.codingchallenge.objectmodel.RocketLaunch

class DetailFragment: Fragment(R.layout.fragment_detail)
{
    private var _binding: FragmentDetailBinding? = null

    private val binding: FragmentDetailBinding
        get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        set(arguments?.get("launch") as RocketLaunch?)
    }


    fun set(launch: RocketLaunch?)
    {
        if(launch == null
                || context == null)
        {
            return;
        }

        binding.flightNumberValue.text = launch.flightNumber.toString()
        binding.detailsValue.text = launch.details
        binding.launchDateUTCValue.text = launch.dateShort()

        var text: String = ""
        var textColor: Int

        when(launch.launchStatus()) {
            LaunchStatus.SUCCESS -> { text = requireContext().getString(R.string.successful); textColor = Color.GREEN }
            LaunchStatus.UNSUCCESSFUL -> { text = requireContext().getString(R.string.unsuccessful); textColor = Color.RED }
            LaunchStatus.UPCOMING -> { text = requireContext().getString(R.string.upcoming); textColor = Color.YELLOW }
        }

        binding.launchSuccessValue.text = text
        binding.launchSuccessValue.setTextColor(textColor)

    }

}