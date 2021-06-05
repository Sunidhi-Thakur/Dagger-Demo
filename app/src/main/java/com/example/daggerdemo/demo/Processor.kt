package com.example.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Processor {

    @Inject
    constructor()
    fun buildProcessor(){
        Log.d("Sunidhi","Deploying Processor ...")
    }

}