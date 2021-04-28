package com.coderus.codingchallenge.rocketlaunchlist

import android.content.Context
import android.graphics.Color
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.coderus.codingchallenge.R
import com.coderus.codingchallenge.objectmodel.LaunchStatus
import com.coderus.codingchallenge.objectmodel.RocketLaunch

/**
 * Custom view to show a [RocketLaunch] in the list in the list fragment.
 */
class ListItemView(context: Context) : CardView(context) {

    private val missionDateText: TextView
    private val missionNameText: TextView
    private val launchSuccessText: TextView
    public var launch: RocketLaunch? = null

    init {
        inflate(context, R.layout.list_item_view, this)
        val params = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        params.marginStart = 40
        params.marginEnd = 40
        layoutParams = params
        missionDateText = findViewById(R.id.missionDateText)
        missionNameText = findViewById(R.id.missionNameText)
        launchSuccessText = findViewById(R.id.launchSuccessText)
    }

    fun setItem(listItem: RocketLaunch) {
        launch = listItem
        missionNameText.text = listItem.name
        missionDateText.text = listItem.dateShort()

        var text: String = ""
        var textColor: Int

        when (listItem.launchStatus()) {
            LaunchStatus.SUCCESS -> { text = context.getString(R.string.successful); textColor = Color.GREEN }
            LaunchStatus.UNSUCCESSFUL -> { text = context.getString(R.string.unsuccessful); textColor = Color.RED }
            LaunchStatus.UPCOMING -> { text = context.getString(R.string.upcoming); textColor = Color.YELLOW }
        }

        launchSuccessText.text = text
        launchSuccessText.setTextColor(textColor)
    }
}
