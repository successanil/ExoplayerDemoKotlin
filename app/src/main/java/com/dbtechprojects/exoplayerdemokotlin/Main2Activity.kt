package com.dbtechprojects.exoplayerdemokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dbtechprojects.exoplayerdemokotlin.databinding.ActivityMainButtonsBinding

class Main2Activity : AppCompatActivity() {

    lateinit var binding : ActivityMainButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@Main2Activity,R.layout.activity_main_buttons)

    }
}