package org.example.project

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import org.example.project.ui.LoginScreen
import org.example.project.ui.PreviewScreen

@Serializable
object PreviewRoute

@Serializable
object LoginRoute

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = PreviewRoute) {
        composable<PreviewRoute> {
            PreviewScreen { navController.navigate(LoginRoute) }
        }
        composable<LoginRoute> {
            LoginScreen { navController.navigateUp() }
        }
    }
}