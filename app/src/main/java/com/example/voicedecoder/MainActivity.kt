package com.example.voicedecoder

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    companion object {
        init {
            System.loadLibrary("image-to-voice-cpp")
        }
    }


    external fun camToVoice(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = camToVoice().toString()
        setContentView(tv)
    }
}