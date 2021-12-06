package dev.alexmorgan.changethis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import dagger.android.support.DaggerFragment

/**
 * An abstract Fragment that manages a ViewBinding.
 */
abstract class BaseFragment<T : ViewBinding> : DaggerFragment() {

    abstract fun createBinding(inflater: LayoutInflater): T

    private var _binding: T? = null

    /**
     * Gets the binding for this fragment. Note that the binding should only be accessed while the
     * Fragment's view exists (i.e. between onCreateView and OnDestroyView in the Fragment lifecycle.)
     */
    protected val binding: T get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return createBinding(inflater).let {
            _binding = it
            it.root
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}