package com.example.sirius.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
  primary = PrimaryBlue,
  secondary = SecondaryBlue,
  tertiary = TertiaryBlue,
  background = BackgroundWhite,
)

@Composable
fun SiriusTheme(content: @Composable () -> Unit) {
  MaterialTheme(
    colorScheme = LightColorScheme,
    typography = Typography,
    content = content,
  )
}