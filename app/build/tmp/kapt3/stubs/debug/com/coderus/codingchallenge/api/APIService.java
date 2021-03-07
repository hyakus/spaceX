package com.coderus.codingchallenge.api;

import java.lang.System;

/**
 * Retrofit API to retrieve data from the SpaceX API.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/coderus/codingchallenge/api/APIService;", "", "getRocketLaunchList", "", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface APIService {
    @org.jetbrains.annotations.NotNull()
    public static final com.coderus.codingchallenge.api.APIService.Companion Companion = null;
    
    /**
     * Retrieve list of rocket launches from the SpaceX API.
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "launches")
    public abstract java.lang.Object getRocketLaunchList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>> p0);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/coderus/codingchallenge/api/APIService$Companion;", "", "()V", "create", "Lcom/coderus/codingchallenge/api/APIService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.coderus.codingchallenge.api.APIService create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}