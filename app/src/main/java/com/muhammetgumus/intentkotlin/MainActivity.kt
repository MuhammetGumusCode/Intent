package com.muhammetgumus.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muhammetgumus.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       println("Executed onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("Executed onStart");
    }

    override fun onResume() {
        super.onResume()
        println("Executed onResume");
    }

    override fun onPause() {
        super.onPause()
        println("Executed onPause");
    }

    override fun onStop() {
        super.onStop()
        println("Executed onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Executed onDestroy");
    }



    fun next(view: View) {
        val intent  = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        intent.putExtra("surname",10)
        startActivity(intent)
        finish()


    }


}
