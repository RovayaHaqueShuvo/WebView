@file:Suppress("DEPRECATION")

package com.own_world.webview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.own_world.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.web.loadUrl("https://l.facebook.com/l.php?u=https%3A%2F%2Fsrj-shuvo28.github.io%2Fgyaniofficial.com%2FScince.html%3Ffbclid%3DIwAR1ExYYtGiUwEZui6sOZEe5BBfpybNobB0lJCLeWJjq-hLgPvk7o3rF36oQ&h=AT2artPYbPzrJyfBFUoJz21LT9X3RfG5tr_Y9_sXdIpqIqqkOMLcer0uKyR3PlGwILr7m2YKbueCYpVHdDjfxPHPnjUMAwdp31SbfTJ6APqwdJzk79NoamqX-ttMjL7oDmvY6Q")
        binding.web.settings.javaScriptEnabled = true
        binding.web.settings.domStorageEnabled = true
        binding.web.settings.allowContentAccess = true
        binding.web.settings.allowFileAccess = true
        binding.web.settings.allowFileAccessFromFileURLs = true
        binding.web.settings.allowUniversalAccessFromFileURLs = true


    }
}