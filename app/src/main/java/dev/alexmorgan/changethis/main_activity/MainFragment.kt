package dev.alexmorgan.changethis.main_activity

import android.os.Bundle
import android.view.View
import dev.alexmorgan.changethis.BaseFragment
import dev.alexmorgan.changethis.R
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @Inject lateinit var message: String

    override val layoutId = R.layout.main_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        main_fragment_text_view.text = message
    }
}