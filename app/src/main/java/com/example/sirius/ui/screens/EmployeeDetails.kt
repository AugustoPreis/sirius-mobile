package com.example.sirius.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sirius.R
import com.example.sirius.models.Employee
import com.example.sirius.ui.components.Button
import com.example.sirius.ui.components.CardElevated
import com.example.sirius.ui.components.ScreenContainer
import com.example.sirius.ui.theme.SiriusTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun EmployeeDetails(
  id: Int,
  onBack: () -> Unit,
) {
  val employee = Employee(id, "Augusto Preis Tomasi da Silva", LocalDate.now(), "Vendedor", "", 10)

  ScreenContainer(verticalArrangement = Arrangement.Top) {
    Button("Voltar", onClick = onBack)

    Spacer(modifier = Modifier.height(16.dp))

    CardElevated {
      Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
      ) {
        Image(
          painter = painterResource(id = R.drawable.default_user_photo),
          contentDescription = "User Photo",
        )

      }

      Spacer(modifier = Modifier.height(16.dp))

      HorizontalDivider()

      Spacer(modifier = Modifier.height(16.dp))

      Text(
        employee.name,
        fontSize = 24.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
      )
      Text(employee.position)

      Spacer(modifier = Modifier.height(32.dp))

      Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
      ) {
        Text("Admitido em: ", fontWeight = FontWeight.Bold)

        Text(employee.admissionDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
      }

      Spacer(modifier = Modifier.height(8.dp))


      Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
      ) {
        Text("Atendimentos: ", fontWeight = FontWeight.Bold)

        Text(employee.quantity.toString())
      }

      Spacer(modifier = Modifier.height(16.dp))

      Text("Observações", fontWeight = FontWeight.Bold)

      Column(
        modifier = Modifier
          .fillMaxWidth()
          .verticalScroll(rememberScrollState())
      ) {
        Text(employee.observations)
      }
    }
  }
}

@Composable
@Preview(showBackground = true)
fun EmployeeDetailsPreview() {
  SiriusTheme {
    EmployeeDetails(1) {}
  }
}