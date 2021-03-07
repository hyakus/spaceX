package com.coderus.codingchallenge.rocketlaunchlist;

import java.lang.System;

/**
 * ViewModel class to expose data to the ListFragment that it is required to display.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0011\u0010\u0017\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR)\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/coderus/codingchallenge/rocketlaunchlist/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/coderus/codingchallenge/repository/IRepository;", "(Lcom/coderus/codingchallenge/repository/IRepository;)V", "_resultsStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/coderus/codingchallenge/objectmodel/Event;", "Lcom/coderus/codingchallenge/objectmodel/Resource;", "", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "results", "getResults", "()Landroidx/lifecycle/MutableLiveData;", "resultsStatus", "Landroidx/lifecycle/LiveData;", "getResultsStatus", "()Landroidx/lifecycle/LiveData;", "retrieveAPIData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveData", "Lkotlinx/coroutines/Job;", "retrieveLocalData", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.coderus.codingchallenge.objectmodel.Resource<java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>> results = null;
    private final androidx.lifecycle.MutableLiveData<com.coderus.codingchallenge.objectmodel.Event<com.coderus.codingchallenge.objectmodel.Resource<java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>>> _resultsStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.coderus.codingchallenge.objectmodel.Event<com.coderus.codingchallenge.objectmodel.Resource<java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>>> resultsStatus = null;
    private final com.coderus.codingchallenge.repository.IRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.coderus.codingchallenge.objectmodel.Resource<java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.coderus.codingchallenge.objectmodel.Event<com.coderus.codingchallenge.objectmodel.Resource<java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch>>>> getResultsStatus() {
        return null;
    }
    
    /**
     * Request the list of [RocketLaunch] data.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job retrieveData() {
        return null;
    }
    
    @javax.inject.Inject()
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.repository.IRepository repository) {
        super();
    }
}