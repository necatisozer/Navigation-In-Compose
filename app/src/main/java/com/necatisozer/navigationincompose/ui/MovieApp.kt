package com.necatisozer.navigationincompose.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.necatisozer.navigationincompose.ui.navigation.mainGraph
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun MovieApp() {
    NavigationInComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "home") {
                mainGraph(navController)
            }
        }
    }
}
