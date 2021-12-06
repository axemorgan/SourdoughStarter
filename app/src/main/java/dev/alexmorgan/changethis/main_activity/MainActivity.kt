package dev.alexmorgan.changethis.main_activity

import android.os.Bundle
import dev.alexmorgan.changethis.BaseActivity
import dev.alexmorgan.changethis.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
