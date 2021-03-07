package com.coderus.codingchallenge.dagger;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/coderus/codingchallenge/dagger/Module;", "", "()V", "provideDB", "Lcom/coderus/codingchallenge/room/AppDatabase;", "context", "Landroid/content/Context;", "provideRepository", "Lcom/coderus/codingchallenge/repository/IRepository;", "db", "app_debug"})
@dagger.Module()
public final class Module {
    @org.jetbrains.annotations.NotNull()
    public static final com.coderus.codingchallenge.dagger.Module INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.coderus.codingchallenge.room.AppDatabase provideDB(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.coderus.codingchallenge.repository.IRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.room.AppDatabase db) {
        return null;
    }
    
    private Module() {
        super();
    }
}