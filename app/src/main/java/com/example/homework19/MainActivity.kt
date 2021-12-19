package com.example.homework19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework19.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.button.setOnClickListener {
            DisplayOnActivity.display(supportFragmentManager, MainFragment.newInstance(), R.id.container)
        }
    }
}
