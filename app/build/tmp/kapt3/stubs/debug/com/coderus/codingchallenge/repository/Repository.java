package com.coderus.codingchallenge.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/coderus/codingchallenge/repository/Repository;", "Lcom/coderus/codingchallenge/repository/IRepository;", "db", "Lcom/coderus/codingchallenge/room/AppDatabase;", "(Lcom/coderus/codingchallenge/room/AppDatabase;)V", "getAllLaunches", "", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "insertAll", "", "launches", "retrieveRemoteData", "Lcom/coderus/codingchallenge/objectmodel/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository implements com.coderus.codingchallenge.repository.IRepository {
    private final com.coderus.codingchallenge.room.AppDatabase db = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> getAllLaunches() {
        return null;
    }
    
    @java.lang.Override()
    public void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> launches) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object retrieveRemoteData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.coderus.codingchallenge.objectmodel.Resource<? extends java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.room.AppDatabase db) {
        super();
    }
}