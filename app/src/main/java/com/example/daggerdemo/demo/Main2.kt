package com.example.daggerdemo.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class Main2 @Inject constructor(
        @FirstName
        private val firstName: String,
        @LastName
        private val lastName:String) {

    fun getName(){
        Log.d("Sunidhi","My name is $firstName $lastName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp{

    @Provides
    @FirstName
    fun getFirstName():String = "Sunidhi"

    @Provides
    @LastName
    fun getLastName():String = "Thakur"
}


//For first name
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstName

//For last name
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LastName