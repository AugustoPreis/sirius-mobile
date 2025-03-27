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
import com.example.sirius.ui.theme.SiriusTheme

@Composable
fun PasswordRecovery() {
  ScreenContainer {
    Text(
      text = "Informe seu Email",
      fontSize = 24.sp,
      fontWeight = FontWeight.Bold,
    )

    Text(
      text = "Enviaremos um email com o link de redefinição da sua senha",
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
      label = { Text("Email") },
      modifier = Modifier.fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(32.dp))

    Button(
      text = "Enviar Link de Redefinição",
      onClick = { },
    )

    Spacer(modifier = Modifier.height(16.dp))

    Button(
      text = "Voltar para o Login",
      onClick = { },
      buttonColor = SecondaryBlue,
    )
  }
}

@Composable
@Preview(showBackground = true)
fun PasswordRecoveryPreview() {
  SiriusTheme {
    PasswordRecovery()
  }
}