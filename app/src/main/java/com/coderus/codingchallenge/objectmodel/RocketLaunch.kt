package com.coderus.codingchallenge.objectmodel

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.format.FormatStyle
import java.util.Locale

/**
 * Model object to store data about a rocket launch.
 */
@Entity(tableName = "launch")
@JsonClass(generateAdapter = true)
data class RocketLaunch(
    @Json(name = "flight_number")
    @PrimaryKey
    val flightNumber: Int,

    @Json(name = "name")
    @ColumnInfo(name = "name")
    val name: String,

    @Json(name = "date_utc")
    @ColumnInfo(name = "date_utc")
    val dateUTC: String,

    @Json(name = "details")
    @ColumnInfo(name = "details")
    val details: String?,

    @Json(name = "success")
    @ColumnInfo(name = "success")
    val success: Boolean?
) : Parcelable {
        /**
        *   Convenience method that returns an Instant from dateUTC.
        */
        fun dateInstant(): Instant {
            val df: DateTimeFormatter =
                DateTimeFormatterBuilder()
                        .parseCaseInsensitive()
                        .appendPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                        .toFormatter(Locale.ENGLISH)
            val date = LocalDateTime.parse(dateUTC, df)

            return date.toInstant(ZoneOffset.UTC)
        }
        /**
        *   Returns a short date from dateUTC for displaying a shorter date.
        */
        fun dateShort(): String {
            val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                    .withLocale(Locale.UK)
                    .withZone(ZoneId.systemDefault())
            return formatter.format(dateInstant())
        }
        /**
        *   Calculate [LaunchStatus] using Success/ isFutureLaunch().
        */
        fun launchStatus(): LaunchStatus {
            return if (success == true) {
                LaunchStatus.SUCCESS
            } else {
                if (isFutureLaunch()) LaunchStatus.UPCOMING else LaunchStatus.UNSUCCESSFUL
            }
        }
        /**
        *   Returns true if the launch dateUTC is after now().
        */
        @Suppress("CommentOverPrivateFunction")
        private fun isFutureLaunch(): Boolean = dateInstant().isAfter(Instant.now())

        /**
        *   Parcelable implementation.
         */
        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(flightNumber)
            parcel.writeString(name)
            parcel.writeString(dateUTC)
            parcel.writeString(details)
            parcel.writeValue(success)
        }

        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readString() ?: "",
                parcel.readString() ?: "",
                parcel.readString(),
                parcel.readValue(Boolean::class.java.classLoader) as? Boolean)
        /**
        *   Parcelable implementation.
        */
        override fun describeContents(): Int = 0

        /**
        *   Parcelable implementation.
        */
        companion object CREATOR : Parcelable.Creator<RocketLaunch> {
            /**
             *   Parcelable implementation.
             */
            override fun createFromParcel(parcel: Parcel): RocketLaunch = RocketLaunch(parcel)

            /**
             *   Parcelable implementation.
             */
            override fun newArray(size: Int): Array<RocketLaunch?> = arrayOfNulls(size)
        }
    }
