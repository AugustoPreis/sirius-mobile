package com.example.sirius.utils

object Routes {
  //WITHOUT AUTH
  const val LOGIN = "login"
  const val PASSWORD_RECOVERY = "password-recovery"
  const val PASSWORD_RESET = "password-reset"

  //WITH AUTH
  const val HOME = "home"
  const val HOME_FILTER = "home-filter"
  const val EMPLOYEE_DETAILS = "employee-details/{id}"
}