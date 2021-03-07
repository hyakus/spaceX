package com.coderus.codingchallenge.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/coderus/codingchallenge/repository/IRepository;", "", "getAllLaunches", "", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "insertAll", "", "launches", "retrieveRemoteData", "Lcom/coderus/codingchallenge/objectmodel/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> getAllLaunches();
    
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> launches);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retrieveRemoteData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.coderus.codingchallenge.objectmodel.Resource<? extends java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>> p0);
}