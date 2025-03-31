package com.example.sirius.models

import java.time.LocalDate

data class Employee(
  val id: Int,
  val name: String,
  val admissionDate: LocalDate,
  val position: String,
  val observations: String,
  val quantity: Int,
)