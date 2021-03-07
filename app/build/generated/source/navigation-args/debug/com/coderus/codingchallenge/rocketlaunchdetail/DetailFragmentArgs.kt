package com.coderus.codingchallenge.rocketlaunchdetail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val launch: RocketLaunch
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __launch : RocketLaunch?
      if (bundle.containsKey("launch")) {
        if (Parcelable::class.java.isAssignableFrom(RocketLaunch::class.java) ||
            Serializable::class.java.isAssignableFrom(RocketLaunch::class.java)) {
          __launch = bundle.get("launch") as RocketLaunch?
        } else {
          throw UnsupportedOperationException(RocketLaunch::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__launch == null) {
          throw IllegalArgumentException("Argument \"launch\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"launch\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__launch)
    }
  }
}
