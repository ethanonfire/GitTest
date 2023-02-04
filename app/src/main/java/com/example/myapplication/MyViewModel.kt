package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel :  ViewModel(){
   // var _true_or_false: Boolean = false


    val data = MutableLiveData<Data>()

    fun update(d:Data){
        data.value = d
    }





}