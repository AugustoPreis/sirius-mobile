package com.example.sirius.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sirius.models.Employee
import com.example.sirius.ui.screens.Home
import com.example.sirius.ui.theme.SiriusTheme
import java.time.LocalDate

@Composable
fun EmployeesList() {
  val funcionarios = listOf(
    Employee(1, "Augusto Preis Tomasi da Silva", LocalDate.now(), "Vendedor", "", 10),
    Employee(2, "Lucas Barbosa", LocalDate.now(), "Vendedor", "", 12),
    Employee(3, "Júlia dos Santos da Silva", LocalDate.now(), "Vendedor (Balcão)", "", 20),
  )

  Column(
    modifier = Modifier
      .fillMaxWidth()
      .verticalScroll(rememberScrollState())
  ) {
    funcionarios.forEach {
      EmployeeCard(it)
    }
  }
}

@Composable
fun EmployeeCard(employee: Employee) {
  CardElevated {
    Row(
      horizontalArrangement = Arrangement.SpaceBetween,
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .fillMaxWidth(),
    ) {
      Column(modifier = Modifier.weight(1f)) {
        Text(
          employee.name,
          fontSize = 24.sp,
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
        )
      }

      Icon(
        imageVector = Icons.Filled.Info,
        contentDescription = "Info",
      )
    }

    Row {
      Text(employee.position)
    }

    Spacer(modifier = Modifier.height(24.dp))

    Row(verticalAlignment = Alignment.Bottom) {
      Text(
        employee.quantity.toString(),
        fontSize = 24.sp,
        fontWeight = FontWeight.ExtraBold,
      )
      Text(" atendimentos realizados")
    }
  }
}

@Composable
@Preview(showBackground = true)
fun EmployeesListPreview() {
  SiriusTheme {
    Home()
  }
}