package com.example.androidmvvmexample.di

import com.example.androidmvvmexample.repository.DataSource
import com.example.androidmvvmexample.repository.DataSourceImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DataSourceModule {

    @Binds
    abstract fun bindDataSource(impl: DataSourceImp): DataSource
}