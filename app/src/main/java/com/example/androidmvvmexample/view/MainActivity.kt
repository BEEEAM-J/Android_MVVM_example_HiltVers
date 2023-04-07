package com.example.androidmvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.androidmvvmexample.R
import com.example.androidmvvmexample.common.ViewModelFactory
import com.example.androidmvvmexample.databinding.ActivityMainBinding
import com.example.androidmvvmexample.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel: MainViewModel by viewModels()

        binding.btnLogin.setOnClickListener {
            viewModel.loadResult(binding.edtId.text.toString(), binding.edtPassword.text.toString())
        }

        viewModel.loginStatus.observe(this) {
            binding.tvResult.text = it.toString()
        }
    }
}