package com.coderus.codingchallenge.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/coderus/codingchallenge/room/LaunchDao;", "", "delete", "", "launch", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "getAllLaunches", "", "insert", "insertAll", "launches", "updateLaunch", "app_debug"})
public abstract interface LaunchDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM launch")
    public abstract java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> getAllLaunches();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> launches);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.objectmodel.RocketLaunch launch);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.objectmodel.RocketLaunch launch);
    
    @androidx.room.Update()
    public abstract void updateLaunch(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.objectmodel.RocketLaunch launch);
}