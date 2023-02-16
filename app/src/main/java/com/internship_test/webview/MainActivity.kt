package com.internship_test.webview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.apps_flyer)
        button2 = findViewById(R.id.adjust)

        button.setOnClickListener { openWebPage(APPS) }

        button2.setOnClickListener { openWebPage(ADJUST) }
    }

    private fun openWebPage(url: String) {
        WebActivity.URL = url
        startActivity(Intent(this@MainActivity, WebActivity::class.java))
    }

    companion object {
        const val APPS = "https://www.appsflyer.com/"
        const val ADJUST = "https://www.adjust.com/"

    }
}