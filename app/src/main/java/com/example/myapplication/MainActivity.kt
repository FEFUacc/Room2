package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var vm: MyVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this).get(MyVM::class.java)

        vm.getUsers()

        findViewById<Button>(R.id.button).setOnClickListener {
            val user = User("LOGIN", "123212")
            vm.add(user)
        }

        vm.data.observe(this) {
            findViewById<TextView>(R.id.tv).text = it
        }
    }
}