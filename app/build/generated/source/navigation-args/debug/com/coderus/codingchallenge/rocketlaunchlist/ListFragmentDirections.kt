package com.coderus.codingchallenge.rocketlaunchlist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.coderus.codingchallenge.R
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ListFragmentDirections private constructor() {
  private data class ActionToDetailFragment(
    public val launch: RocketLaunch
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_to_detailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(RocketLaunch::class.java)) {
        result.putParcelable("launch", this.launch as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(RocketLaunch::class.java)) {
        result.putSerializable("launch", this.launch as Serializable)
      } else {
        throw UnsupportedOperationException(RocketLaunch::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionToDetailFragment(launch: RocketLaunch): NavDirections =
        ActionToDetailFragment(launch)
  }
}
