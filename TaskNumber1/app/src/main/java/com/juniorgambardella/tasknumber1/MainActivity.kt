package com.juniorgambardella.tasknumber1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.juniorgambardella.tasknumber1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var viewBinding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewBinding = ActivityMainBinding.inflate(layoutInflater)
    val view = viewBinding.root
    setContentView(view)

    viewBinding.sendButton.setOnClickListener {
      viewBinding.title.text = viewBinding.information.text
      val snack = Snackbar.make(viewBinding.linearLayout, viewBinding.title.text, Snackbar.LENGTH_LONG)
      snack.show()
    }
  }
}
