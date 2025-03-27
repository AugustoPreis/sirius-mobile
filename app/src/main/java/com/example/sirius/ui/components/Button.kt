package com.example.sirius.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sirius.ui.theme.PrimaryBlue

@Composable
fun Button(
  text: String,
  onClick: () -> Unit,
  buttonColor: Color = PrimaryBlue,
) {
  Button(
    onClick = onClick,
    shape = RoundedCornerShape(8.dp),
    modifier = Modifier.fillMaxWidth(),
    colors = ButtonDefaults.buttonColors(buttonColor),
  ) {
    Text(
      text,
      fontSize = 16.sp,
      modifier = Modifier.padding(vertical = 8.dp),
    )
  }
}