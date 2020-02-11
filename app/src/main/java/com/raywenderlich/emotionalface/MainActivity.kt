package com.raywenderlich.emotionalface

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


    happyButton.setOnClickListener {
      emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
    }

    sadButton.setOnClickListener {
      emotionalFaceView.happinessState = EmotionalFaceView.SAD
    }
  }
}
