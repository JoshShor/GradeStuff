package com.example.gradestuff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gradeSwitchButton = findViewById<Button>(R.id.go_to_grade_btn)
        gradeSwitchButton.setOnClickListener {
            val intent = Intent(this@MainActivity, GradeActivity::class.java)
            startActivity(intent)
        }
    }
}