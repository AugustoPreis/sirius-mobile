package com.example.sirius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import com.example.sirius.ui.theme.SiriusTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // Avoid using the front camera part
    WindowCompat.setDecorFitsSystemWindows(window, false)
    ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { view, insets ->
      val displayCutout = insets.displayCutout

      if (displayCutout != null) {
        val safeInsetTop = displayCutout.safeInsetTop
        val safeInsetBottom = displayCutout.safeInsetBottom

        view.setPadding(0, safeInsetTop, 0, safeInsetBottom)
      }

      insets
    }

    setContent {
      SiriusTheme {
        Navigator()
      }
    }
  }
}