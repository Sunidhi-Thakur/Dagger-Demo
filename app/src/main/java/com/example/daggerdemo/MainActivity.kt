package com.example.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerdemo.demo.Mobile
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mobile: Mobile //Object created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mobile.startMobile()

    }
}