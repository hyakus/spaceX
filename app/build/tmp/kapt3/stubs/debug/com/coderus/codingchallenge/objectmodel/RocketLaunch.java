package com.coderus.codingchallenge.objectmodel;

import java.lang.System;

/**
 * Model object to store data about a rocket launch.
 */
@androidx.room.Entity(tableName = "launch")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B;\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015JD\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\bJ\b\u0010!\u001a\u00020\u0006H\u0016J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\b\u0010&\u001a\u00020\fH\u0002J\u0006\u0010\'\u001a\u00020(J\t\u0010)\u001a\u00020\bH\u00d6\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006."}, d2 = {"Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "flightNumber", "", "name", "", "dateUTC", "details", "success", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDateUTC", "()Ljava/lang/String;", "getDetails", "getFlightNumber", "()I", "getName", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "dateInstant", "Ljava/time/Instant;", "dateShort", "describeContents", "equals", "other", "", "hashCode", "isFutureLaunch", "launchStatus", "Lcom/coderus/codingchallenge/objectmodel/LaunchStatus;", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class RocketLaunch implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    private final int flightNumber = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "date_utc")
    private final java.lang.String dateUTC = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "details")
    private final java.lang.String details = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "success")
    private final java.lang.Boolean success = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.coderus.codingchallenge.objectmodel.RocketLaunch.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant dateInstant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dateShort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.coderus.codingchallenge.objectmodel.LaunchStatus launchStatus() {
        return null;
    }
    
    private final boolean isFutureLaunch() {
        return false;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final int getFlightNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateUTC() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSuccess() {
        return null;
    }
    
    public RocketLaunch(@com.squareup.moshi.Json(name = "flight_number")
    int flightNumber, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "date_utc")
    java.lang.String dateUTC, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "details")
    java.lang.String details, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "success")
    java.lang.Boolean success) {
        super();
    }
    
    public RocketLaunch(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    /**
     * Model object to store data about a rocket launch.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.coderus.codingchallenge.objectmodel.RocketLaunch copy(@com.squareup.moshi.Json(name = "flight_number")
    int flightNumber, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "date_utc")
    java.lang.String dateUTC, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "details")
    java.lang.String details, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "success")
    java.lang.Boolean success) {
        return null;
    }
    
    /**
     * Model object to store data about a rocket launch.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Model object to store data about a rocket launch.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model object to store data about a rocket launch.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/coderus/codingchallenge/objectmodel/RocketLaunch$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.coderus.codingchallenge.objectmodel.RocketLaunch> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.coderus.codingchallenge.objectmodel.RocketLaunch createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.coderus.codingchallenge.objectmodel.RocketLaunch[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}