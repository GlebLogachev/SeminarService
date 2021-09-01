package com.glogachev.seminarservice.baseService

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.glogachev.seminarservice.R
import com.glogachev.seminarservice.databinding.ActivityBaseServiceBinding

class BaseServiceActivity : AppCompatActivity() {
    val binding : ActivityBaseServiceBinding by lazy {
        ActivityBaseServiceBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}