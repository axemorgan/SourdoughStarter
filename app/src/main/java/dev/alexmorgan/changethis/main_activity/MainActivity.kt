package dev.alexmorgan.changethis.main_activity

import android.os.Bundle
import dev.alexmorgan.changethis.BaseActivity
import dev.alexmorgan.changethis.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
