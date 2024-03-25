package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MyVM : ViewModel() {

    val data = MutableLiveData<String>()


    fun add(user: User) {
        viewModelScope.launch {
            Dep.db.getUserDao().insert(user)
            getUsers()
        }
    }

    fun getUsers() {
        viewModelScope.launch {
            data.value = Dep.db.getUserDao().getAllUsers().toString()
        }
    }

}