package com.example.sirius.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sirius.ui.components.Button
import com.example.sirius.ui.components.ScreenContainer
import com.example.sirius.ui.theme.SecondaryBlue

@Composable
fun PasswordReset() {
  ScreenContainer {
    Text(
      text = "Informe a nova senha",
      fontSize = 24.sp,
      fontWeight = FontWeight.Bold,
    )

    Text(
      text = "Informe a nova senha que você irá utilizar para acessar o sistema",
      fontSize = 16.sp,
      textAlign = TextAlign.Center,
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp),
    )

    Spacer(modifier = Modifier.height(64.dp))

    OutlinedTextField(
      value = "",
      onValueChange = { },
      label = { Text("Nova senha") },
      modifier = Modifier.fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(32.dp))

    Button(
      text = "Confirmar",
      onClick = { },
    )

    Spacer(modifier = Modifier.height(16.dp))

    Button(
      text = "Cancelar Redefinição",
      onClick = { },
      buttonColor = SecondaryBlue,
    )
  }
}

@Composable
@Preview(showBackground = true)
fun PasswordResetPreview() {
  PasswordReset()
}