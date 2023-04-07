package com.example.androidmvvmexample.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvmexample.repository.DataSourceImp
import com.example.androidmvvmexample.repository.MainRepository
import com.example.androidmvvmexample.viewmodel.MainViewModel

class ViewModelFactory: ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            return MainViewModel(MainRepository(DataSourceImp())) as T
//        } else {
//            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
//        }
//    }
}