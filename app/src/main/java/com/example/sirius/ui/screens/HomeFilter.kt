package com.example.sirius.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirius.ui.components.Button
import com.example.sirius.ui.components.CardElevated
import com.example.sirius.ui.components.ScreenContainer
import com.example.sirius.ui.theme.SecondaryBlue
import com.example.sirius.ui.theme.SiriusTheme
import com.example.sirius.ui.theme.TertiaryBlue

@Composable
fun HomeFilter() {
  ScreenContainer(verticalArrangement = Arrangement.Top) {
    Row {
      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(end = 8.dp),
      ) {
        Button("Cancelar", onClick = {}, buttonColor = SecondaryBlue)
      }

      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(start = 8.dp),
      ) {
        Button("Confirmar", onClick = {})
      }
    }

    Spacer(modifier = Modifier.height(16.dp))

    CardFilter("Nº Atendimentos") {
      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(end = 8.dp),
      ) {
        OutlinedTextField(
          value = "",
          onValueChange = { },
          label = { Text("Início") },
          modifier = Modifier
            .fillMaxWidth(),
        )
      }

      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(start = 8.dp),
      ) {
        OutlinedTextField(
          value = "",
          onValueChange = { },
          label = { Text("Fim") },
          modifier = Modifier
            .fillMaxWidth(),
        )
      }
    }

    Spacer(modifier = Modifier.height(8.dp))

    CardFilter("Período") {
      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(end = 8.dp),
      ) {
        OutlinedTextField(
          value = "",
          onValueChange = { },
          label = { Text("Início") },
          modifier = Modifier
            .fillMaxWidth(),
        )
      }

      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(start = 8.dp),
      ) {
        OutlinedTextField(
          value = "",
          onValueChange = { },
          label = { Text("Fim") },
          modifier = Modifier
            .fillMaxWidth(),
        )
      }
    }

    Spacer(modifier = Modifier.height(8.dp))

    CardFilter("Função") {
      OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text("Digite o nome da função") },
        modifier = Modifier
          .fillMaxWidth(),
      )
    }

    Spacer(modifier = Modifier.height(8.dp))

    CardFilter("Trabalhando agora") {
      Column(
        modifier = Modifier
          .weight(0.5f)
          .alpha(0.6f)
          .padding(end = 8.dp),
      ) {
        Button("Não", onClick = {}, buttonColor = TertiaryBlue)
      }

      Column(
        modifier = Modifier
          .weight(0.5f)
          .padding(start = 8.dp),
      ) {
        Button("Sim", onClick = {}, buttonColor = TertiaryBlue)
      }
    }
  }
}

@Composable
fun CardFilter(name: String, content: @Composable (RowScope.() -> Unit)) {
  CardElevated {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .fillMaxWidth(),
    ) {
      Text(name, fontWeight = FontWeight.Bold)
    }

    Spacer(modifier = Modifier.height(8.dp))

    HorizontalDivider()

    Spacer(modifier = Modifier.height(16.dp))

    Row(content = content)
  }
}

@Composable
@Preview(showBackground = true)
fun HomeFilterPreview() {
  SiriusTheme {
    HomeFilter()
  }
}