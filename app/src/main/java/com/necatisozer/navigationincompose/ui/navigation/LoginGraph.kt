package com.necatisozer.navigationincompose.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.necatisozer.navigationincompose.ui.login.LoginCompleteScreen
import com.necatisozer.navigationincompose.ui.login.PasswordScreen
import com.necatisozer.navigationincompose.ui.login.UsernameScreen

fun NavGraphBuilder.loginGraph(navController: NavController) {
    navigation("username", "login") {
        composable("username") {
            UsernameScreen(onNextClick = { navController.navigate("password") })
        }
        composable("password") {
            PasswordScreen(onNextClick = { navController.navigate("login-complete") })
        }
        composable("login-complete") {
            LoginCompleteScreen(
                onLoginClick = { navController.popBackStack("login", true) }
            )
        }
    }
}
