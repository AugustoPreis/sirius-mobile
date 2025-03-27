package com.example.sirius.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp

val interGoogleFont = FontFamily(
  androidx.compose.ui.text.googlefonts.Font(
    googleFont = GoogleFont("Inter"),
    weight = FontWeight.Normal,
    fontProvider = GoogleFont.Provider(
      providerAuthority = "com.google.android.gms.fonts",
      providerPackage = "com.google.android.gms",
      certificates = emptyList(),
    ),
  ),
)

val Typography = Typography(
  bodyLarge = TextStyle(
    fontFamily = interGoogleFont,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.5.sp
  )
)