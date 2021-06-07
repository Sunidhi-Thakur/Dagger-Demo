package com.example.daggerdemo.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

//Since Interfaces do no have constructors, @Inject is no used.

interface One{
    fun getModel()
}

//@Inject is used for class
class ImplementOne @Inject constructor(private var name: String): One{
    override fun getModel() {
        Log.d("Sunidhi", "Interface Implemented ..., parameter = $name")
    }
}

class Main @Inject constructor(private val one: One){
    fun getModel(){
        one.getModel()
    }
}

//To provide dependency for interface
/*@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule{

    @Binds
     abstract fun binding(implementOne: ImplementOne): One

}*/


@Module
@InstallIn(SingletonComponent::class)
class AppModule{

    @Provides
    fun getName():String = "Sunidhi"
    @Provides
    fun binding(name: String):One = ImplementOne(name)
}