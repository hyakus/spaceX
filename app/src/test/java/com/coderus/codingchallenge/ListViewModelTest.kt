package com.coderus.codingchallenge

import com.coderus.codingchallenge.rocketlaunchlist.ListViewModel
import org.junit.Before

class ListViewModelTest {
    private lateinit var viewModel: ListViewModel
    @Before
    fun setUp() {
        viewModel = ListViewModel(MockHelper.mockRepository())
    }
}
