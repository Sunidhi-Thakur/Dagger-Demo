package com.example.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerdemo.demo.Main2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var main: Main2
   // lateinit var mobile: Mobile //Object created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // mobile.startMobile()
       // main.getModel()
       main.getName()

    }
}