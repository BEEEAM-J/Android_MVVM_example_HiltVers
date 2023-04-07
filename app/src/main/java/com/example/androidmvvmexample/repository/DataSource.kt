package com.example.androidmvvmexample.repository

import com.example.androidmvvmexample.model.Data

interface DataSource {
    val data: Data
    fun login(usrId: String?, usrPasswd: String?): String
}