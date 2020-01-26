package dev.alexmorgan.changethis.extensions

import android.view.View

/**
 * Sets this View's visibility to [View.INVISIBLE]
 */
fun View.invisible() {
    this.visibility = View.INVISIBLE
}

/**
 * Sets this View's visibility to [View.VISIBLE]
 */
fun View.visible() {
    this.visibility = View.VISIBLE
}

/**
 * Sets this View's visibility to [View.GONE]
 */
fun View.gone() {
    this.visibility = View.GONE
}