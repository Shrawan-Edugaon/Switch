package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val swt = findViewById<Switch>(R.id.switchId) as Switch

        swt.setOnClickListener {
            if (swt.isChecked)
                Toast.makeText(this@MainActivity,"Switch ON",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this@MainActivity,"Switch OFF",Toast.LENGTH_SHORT).show()
        }
    }
}