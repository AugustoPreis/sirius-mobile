package com.example.sirius.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenContainer(
  verticalArrangement: Arrangement.Vertical = Arrangement.Center,
  horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
  content: @Composable (ColumnScope.() -> Unit),
) {
  Column(
    verticalArrangement = verticalArrangement,
    horizontalAlignment = horizontalAlignment,
    content = content,
    modifier = Modifier
      .fillMaxSize()
      .padding(24.dp),
  )
}