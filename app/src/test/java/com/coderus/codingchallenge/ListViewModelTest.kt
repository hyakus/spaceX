package com.coderus.codingchallenge

import com.coderus.codingchallenge.rocketlaunchlist.ListViewModel
import io.mockk.coVerify
import org.junit.Test
import io.mockk.verify

class ListViewModelTest {

    @Test
    fun `viewModel is created and calls retrieveData`()
    {
        val repository = MockHelper.mockRepository()
        ListViewModel(repository)
        coVerify { repository.retrieveRemoteData() }
        verify { repository.getAllLaunches() }
    }

}
