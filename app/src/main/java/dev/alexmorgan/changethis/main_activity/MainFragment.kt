package dev.alexmorgan.changethis.main_activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import dev.alexmorgan.changethis.BaseFragment
import dev.alexmorgan.changethis.databinding.MainFragmentBinding
import javax.inject.Inject

class MainFragment : BaseFragment<MainFragmentBinding>() {

    @Inject
    lateinit var message: String

    override fun createBinding(inflater: LayoutInflater) = MainFragmentBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainFragmentTextView.text = message
    }
}