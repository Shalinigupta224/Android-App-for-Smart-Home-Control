package com.rajkishorbgp.smarthomecontrol

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rajkishorbgp.smarthomecontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Toolbar setup
        setSupportActionBar(binding.toolbar)
        binding.toolbar.title = "Smart Home Control"

        // Default Fragment
        supportFragmentManager.beginTransaction().replace(R.id.flFragment, HomeFragment()).commit()

        // Bottom Navigation Listener (Kotlin style)
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> supportFragmentManager.beginTransaction().replace(R.id.flFragment,
                    HomeFragment()).commit()
                R.id.profile -> supportFragmentManager.beginTransaction().replace(R.id.flFragment,
                    RoomsFragment()).commit()
                R.id.settings -> supportFragmentManager.beginTransaction().replace(R.id.flFragment,
                    HistoryFragment()).commit()
            }
            true
        }
    }
}