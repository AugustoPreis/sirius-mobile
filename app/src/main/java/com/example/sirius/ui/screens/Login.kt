package com.example.sirius.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirius.R
import com.example.sirius.ui.components.Button
import com.example.sirius.ui.components.ScreenContainer
import com.example.sirius.ui.theme.SecondaryBlue
import com.example.sirius.ui.theme.SiriusTheme

@Composable
fun Login() {
  ScreenContainer {
    Image(
      painter = painterResource(id = R.drawable.sirius_logo),
      contentDescription = "Logo",
    )

    Spacer(modifier = Modifier.height(32.dp))

    OutlinedTextField(
      value = "",
      onValueChange = { },
      label = { Text("CNPJ, Email ou nome de usuário") },
      modifier = Modifier
        .fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(16.dp))

    OutlinedTextField(
      value = "",
      onValueChange = { },
      label = { Text("Senha") },
      modifier = Modifier
        .fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(8.dp))

    Text(
      "Esqueci minha senha",
      color = SecondaryBlue,
      modifier = Modifier
        .fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(32.dp))

    Button("Entrar", onClick = {})
  }
}

@Composable
@Preview(showBackground = true)
fun LoginPreview() {
  SiriusTheme {
    Login()
  }
}