package com.example.sirius.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirius.ui.components.Button
import com.example.sirius.ui.components.EmployeesList
import com.example.sirius.ui.components.ScreenContainer
import com.example.sirius.ui.theme.SiriusTheme

@Composable
fun Home() {
  ScreenContainer(verticalArrangement = Arrangement.Top) {
    OutlinedTextField(
      value = "",
      onValueChange = { },
      label = { Text("Filtrar por nome do funcionário...") },
      modifier = Modifier
        .fillMaxWidth(),
    )

    Spacer(modifier = Modifier.height(16.dp))

    Button("Mais filtros", onClick = {})

    Spacer(modifier = Modifier.height(32.dp))

    HorizontalDivider()

    Spacer(modifier = Modifier.height(24.dp))

    EmployeesList()
  }
}

@Composable
@Preview(showBackground = true)
fun HomePreview() {
  SiriusTheme {
    Home()
  }
}