// Generated by Dagger (https://dagger.dev).
package com.coderus.codingchallenge.repository;

import com.coderus.codingchallenge.room.AppDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<AppDatabase> dbProvider;

  public Repository_Factory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public Repository get() {
    return newInstance(dbProvider.get());
  }

  public static Repository_Factory create(Provider<AppDatabase> dbProvider) {
    return new Repository_Factory(dbProvider);
  }

  public static Repository newInstance(AppDatabase db) {
    return new Repository(db);
  }
}