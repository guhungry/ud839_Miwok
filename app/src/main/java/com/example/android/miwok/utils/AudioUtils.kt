package com.example.android.miwok.utils

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer

class AudioUtils {
    companion object {
        private var player: MediaPlayer? = null

        fun playAudio(context: Context, audioManager: AudioManager, file: Int) {
            releaseAudio()
            audioManager.requestAudioFocus(listener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT)
            player = MediaPlayer.create(context, file).apply {
                setOnCompletionListener { player ->
                    audioManager.abandonAudioFocus(listener)
                    releaseAudio()
                }
                start()
            }
        }

        fun resumeAudio() {
            player?.start()
        }

        fun pauseAudio() {
            player?.pause()
        }

        fun releaseAudio() {
            player?.release()
            player = null
        }

        val listener = AudioManager.OnAudioFocusChangeListener {
            when (it) {
                AudioManager.AUDIOFOCUS_GAIN -> resumeAudio()
                AudioManager.AUDIOFOCUS_LOSS -> releaseAudio()
                AudioManager.AUDIOFOCUS_LOSS_TRANSIENT -> pauseAudio()
                AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK -> pauseAudio()
            }
        }
    }
}