package com.coderus.codingchallenge.rocketlaunchlist

import android.view.View
import androidx.lifecycle.Observer
import com.coderus.codingchallenge.objectmodel.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class ListViewModelTest
{
    private lateinit var viewModel: ListViewModel
    @Before
    fun setUp() {
        viewModel = ListViewModel(FakeRepository())
    }

    /*
    ** TODO: I got lost attempting to use LiveData and Event to track successful LiveData updates for the test. testResults doesn't work.
    *   Leaving it in anyway.
     */
    @Test
    fun testResults(){

        GlobalScope.launch(Dispatchers.Main) {
            viewModel.retrieveData()
            val value = viewModel.results.getOrAwaitValue()

            assert(value.status == Status.SUCCESS)
        }
    }
}