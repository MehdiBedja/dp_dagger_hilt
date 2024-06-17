package com.example.learning.data.repository

import android.app.Application
import com.example.learning.R
import com.example.learning.data.remote.MyApi
import com.example.learning.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImplementation  @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}