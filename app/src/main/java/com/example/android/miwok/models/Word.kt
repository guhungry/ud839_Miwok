package com.example.android.miwok.models

import android.view.View

data class Word(val default: String, val miwok: String = "", val image: Int = 0) {
    fun hasImage() = image != 0
    fun imageVisibility() = if (hasImage()) View.VISIBLE else View.GONE
}
