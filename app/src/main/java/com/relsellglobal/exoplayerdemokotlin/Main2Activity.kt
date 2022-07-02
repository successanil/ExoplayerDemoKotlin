package com.relsellglobal.exoplayerdemokotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.relsellglobal.exoplayerdemokotlin.databinding.ActivityMainButtonsBinding

class Main2Activity : AppCompatActivity() {

    lateinit var binding : ActivityMainButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@Main2Activity,R.layout.activity_main_buttons)

        binding.buttonStart.setOnClickListener{
            startActivity(Intent(this@Main2Activity,MainActivity::class.java))
        }


    }
}