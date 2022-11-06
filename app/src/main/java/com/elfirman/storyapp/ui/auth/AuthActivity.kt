package com.elfirman.storyapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elfirman.storyapp.R
import com.elfirman.storyapp.databinding.ActivityAuthBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}