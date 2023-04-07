package com.example.androidmvvmexample.repository

import com.example.androidmvvmexample.model.Data
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

class DataSourceImp @Inject constructor() : DataSource {

    override val data: Data
        get() = Data()

    override fun login(usrId: String?, usrPasswd: String?): String {
        return data.login(usrId, usrPasswd)
    }
}