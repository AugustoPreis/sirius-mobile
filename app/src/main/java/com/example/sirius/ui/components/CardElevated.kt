package com.example.sirius.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardElevated(content: @Composable (ColumnScope.() -> Unit)) {
  Card(
    colors = CardDefaults.cardColors(Color.White),
    elevation = CardDefaults.cardElevation(4.dp),
    modifier = Modifier
      .padding(vertical = 8.dp)
      .fillMaxWidth(),
  ) {
    Column(
      content = content,
      modifier = Modifier
        .padding(16.dp),
    )
  }
}