package com.coderus.codingchallenge.rocketlaunchlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coderus.codingchallenge.objectmodel.Event
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.objectmodel.Status
import com.coderus.codingchallenge.repository.IRepository
import com.coderus.codingchallenge.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

/**
 * ViewModel class to expose data to the ListFragment that it is required to display.
 */
@HiltViewModel
class ListViewModel @Inject constructor(private val repository: IRepository) : ViewModel()  {

    val results = MutableLiveData<Resource<List<RocketLaunch>>>()

    /**
     * Request the list of [RocketLaunch] data.
     */
    fun retrieveData() = GlobalScope.launch {
                                retrieveAPIData()
                            }


    private suspend fun retrieveLocalData()
    {
        val response = repository.getAllLaunches()

        results.postValue( if(response.isEmpty()) Resource.error("An unknown error occurred. Please check your network and try again later", null) else Resource.success(response))
    }


    private suspend fun retrieveAPIData()
    {
        val response = repository.retrieveRemoteData()

        if(response.status == Status.SUCCESS)
        {
            response.data?.let { repository.insertAll(it) }
        }

        retrieveLocalData()
    }
}
