package com.geissonlucaso.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geissonlucaso.simulator.databinding.ActivityDetailsBinding
import com.geissonlucaso.simulator.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}