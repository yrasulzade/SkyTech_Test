package com.skytechtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.skytechtest.databinding.ActivitySkyTechBinding

class SkyTechActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySkyTechBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_sky_tech)

        binding.whelpWebView.settings.setJavaScriptEnabled(true)

        binding.whelpWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl("https://www.google.com")
                return true
            }
        }
        binding.whelpWebView.loadUrl("https://www.google.com")


    }
}