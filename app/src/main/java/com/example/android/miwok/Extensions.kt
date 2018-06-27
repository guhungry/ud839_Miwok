package com.example.android.miwok

import android.content.Context
import android.media.AudioManager
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.audioManager() = getSystemService(Context.AUDIO_SERVICE) as AudioManager