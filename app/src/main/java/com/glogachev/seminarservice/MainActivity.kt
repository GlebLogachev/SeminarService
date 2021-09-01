package com.glogachev.seminarservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.forEach
import com.glogachev.seminarservice.baseService.BaseServiceActivity
import com.glogachev.seminarservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.root.forEach {
            if (it is Button) {
                it.setOnClickListener(listener)
            }
        }
    }
    private val listener: View.OnClickListener = View.OnClickListener {
        when (it.id) {
            binding.btnBaseService.id -> routeToService(BaseServiceActivity::class.java)
        }
    }

    private fun <T> routeToService(routeClass : Class<T>) {
        val intent = Intent(this,routeClass)
        startActivity(intent)
    }

}