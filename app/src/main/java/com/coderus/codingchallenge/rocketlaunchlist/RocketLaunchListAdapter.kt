package com.coderus.codingchallenge.rocketlaunchlist

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.coderus.codingchallenge.objectmodel.RocketLaunch

/**
 * ListAdapter class for the Recycler view that displays a list of [RocketLaunch] objects.
 */
class RocketLaunchListAdapter internal constructor(private val context: Context,
                                                   private val onClickListener: View.OnClickListener) :
    ListAdapter<RocketLaunch, RocketLaunchListAdapter.ListItemViewHolder>(
        RocketLaunchListDiffCallback()
    ) {

    inner class ListItemViewHolder(val listItemView: ListItemView) :
        RecyclerView.ViewHolder(listItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(ListItemView(context))
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.listItemView.setItem(item)
        holder.listItemView.setOnClickListener(onClickListener)
    }

    fun update(list: List<RocketLaunch>)
    {
        submitList(list)
    }

}
