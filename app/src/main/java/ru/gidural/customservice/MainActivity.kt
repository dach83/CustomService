package ru.gidural.customservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupStartServiceButton()
    }

    private fun setupStartServiceButton() {
        val startServiceButton = findViewById<Button>(R.id.start_service_button)
        startServiceButton.setOnClickListener { startMyService() }
    }

    private fun startMyService() {
        Intent(this, MyService::class.java).also {
            startService(it)
        }
    }

}