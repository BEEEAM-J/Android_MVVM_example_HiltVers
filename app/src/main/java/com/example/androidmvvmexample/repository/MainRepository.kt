package com.example.androidmvvmexample.repository

import javax.inject.Inject

class MainRepository @Inject constructor(
    private val dataSource: DataSource
) {
    fun loadResult(usrName: String?, usrPasswd: String?): String {
        return dataSource.login(usrName, usrPasswd)
    }
}