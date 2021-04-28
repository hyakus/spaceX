package com.coderus.codingchallenge

import com.coderus.codingchallenge.repository.Repository
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs

object MockHelper {
    fun mockRepository() = mockk<Repository> {

    }
}