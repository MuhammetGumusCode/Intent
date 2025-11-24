package com.muhammetgumus.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muhammetgumus.intentkotlin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val intentFromMain = intent
        val name = intentFromMain.getStringExtra("name")
        binding.nameText.text = "Name: ${name}"
        /*
         val age = intentFromMain.getIntExtra("surname",1)
        println("Age:${age}")
        */

    }

    fun previous (view: View) {
        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)

    }



}