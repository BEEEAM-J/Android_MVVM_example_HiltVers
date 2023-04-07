package com.example.androidmvvmexample.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidmvvmexample.repository.MainRepository
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
    ): ViewModel() {

    private val _loginStatus = MutableLiveData<String>()
    val loginStatus: LiveData<String> = _loginStatus

    fun loadResult(usrName: String, usrPasswd: String) {
        Log.d("태그1", "${usrName}, ${usrPasswd}")
        if (usrName != null && usrPasswd != null) {
            val res: String = repository.loadResult(usrName, usrPasswd)
            res?.let { res ->
                _loginStatus.value = res
            }
        }
    }
}