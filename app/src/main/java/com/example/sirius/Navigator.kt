package com.example.sirius

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sirius.ui.screens.EmployeeDetails
import com.example.sirius.ui.screens.Home
import com.example.sirius.ui.screens.HomeFilter
import com.example.sirius.ui.screens.Login
import com.example.sirius.ui.screens.PasswordRecovery
import com.example.sirius.ui.screens.PasswordReset
import com.example.sirius.utils.Routes

@Composable
fun Navigator() {
  val navController = rememberNavController()

  fun navigator(route: String, clearBackStack: Boolean = false): () -> Unit {
    return {
      navController.navigate(route) {
        if (clearBackStack) {
          popUpTo(navController.graph.startDestinationId) { inclusive = true }
          launchSingleTop = true
        }
      }
    }
  }

  NavHost(
    navController = navController,
    startDestination = Routes.LOGIN,
  ) {
    composable(Routes.LOGIN) {
      Login(
        onLogin = navigator(Routes.HOME, true),
        onPasswordRecovery = navigator(Routes.PASSWORD_RECOVERY),
      )
    }

    composable(Routes.PASSWORD_RECOVERY) {
      PasswordRecovery(
        onBack = { navController.popBackStack() },
      )
    }

    composable(Routes.PASSWORD_RESET) {
      PasswordReset(
        onBack = { navController.popBackStack() },
      )
    }

    composable(Routes.HOME) {
      Home(
        onMoreFilters = navigator(Routes.HOME_FILTER),
        // onLogout = navigator(Routes.LOGIN, true),
        onEmployeeInfo = {
          navController.navigate(Routes.EMPLOYEE_DETAILS.replace("{id}", it.toString()))
        },
      )
    }

    composable(Routes.HOME_FILTER) {
      HomeFilter(
        onBack = { navController.popBackStack() },
      )
    }

    composable(Routes.EMPLOYEE_DETAILS) { backStackEntry ->
      val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: 0

      EmployeeDetails(
        id = id,
        onBack = { navController.popBackStack() },
      )
    }
  }
}