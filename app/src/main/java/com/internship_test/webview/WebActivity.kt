package com.internship_test.webview

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        actionBar?.setDisplayHomeAsUpEnabled(true)

        webView = findViewById(R.id.web_view)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(URL)
        webView.settings.javaScriptEnabled = true
    }

    class  WebClient: WebViewClient() {
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }

    companion object {
        var URL = ""
    }
}