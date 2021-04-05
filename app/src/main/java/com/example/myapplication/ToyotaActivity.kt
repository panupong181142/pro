package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toyota.*

class ToyotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toyota)

        radiobutton.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton2.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton3.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton4.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton5.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton7.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton9.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton6.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
        radioButton8.setOnClickListener {
            startActivity(Intent(this, CalculateMainActivity::class.java))
        }
    }
}