package com.example.eptw_jsw

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val url = "http://103.38.50.194:8080/"
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        webView.webViewClient = WebViewClient() // Prevents opening external browser
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("http://103.38.50.194:8080/")
    }
}

