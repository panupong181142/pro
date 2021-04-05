package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.car_brand.*

class CarBrandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_brand)


        bhonda.setOnClickListener {
            val it = Intent(this,HondaActivity::class.java)
            startActivity(it)}

        btoyota.setOnClickListener {
            val it = Intent(this, ToyotaActivity::class.java)
            startActivity(it)}
        bmazda.setOnClickListener {
            val it = Intent(this, MasdaActivity::class.java)
            startActivity(it)}
        bnissan.setOnClickListener {
            val it = Intent(this, NissanActivity::class.java)
            startActivity(it)}
    }
}