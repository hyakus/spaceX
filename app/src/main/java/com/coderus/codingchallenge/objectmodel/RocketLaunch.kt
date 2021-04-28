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
        fun dateInstant(): Instant {
            val df: DateTimeFormatter =
                DateTimeFormatterBuilder()
                        .parseCaseInsensitive()
                        .appendPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                        .toFormatter(Locale.ENGLISH)
            val date = LocalDateTime.parse(dateUTC, df)

            return date.toInstant(ZoneOffset.UTC)
        }

        fun dateShort(): String {
            val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                    .withLocale(Locale.UK)
                    .withZone(ZoneId.systemDefault())
            return formatter.format(dateInstant())
        }

        fun launchStatus(): LaunchStatus {
            return if (success == true) {
                LaunchStatus.SUCCESS
            } else {
                if (isFutureLaunch()) LaunchStatus.UPCOMING else LaunchStatus.UNSUCCESSFUL
            }
        }

        private fun isFutureLaunch(): Boolean {
            return dateInstant().isAfter(Instant.now())
        }

        /*
        *   Parcelable implementation
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
                parcel.readValue(Boolean::class.java.classLoader) as? Boolean) {
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<RocketLaunch> {
            override fun createFromParcel(parcel: Parcel): RocketLaunch {
                return RocketLaunch(parcel)
            }

            override fun newArray(size: Int): Array<RocketLaunch?> {
                return arrayOfNulls(size)
            }
        }
    }
