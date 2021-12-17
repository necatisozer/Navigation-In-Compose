package com.necatisozer.navigationincompose.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.necatisozer.navigationincompose.ui.HomeScreen
import com.necatisozer.navigationincompose.ui.MovieDetailScreen
import com.necatisozer.navigationincompose.ui.MovieListScreen

fun NavGraphBuilder.mainGraph(navController: NavController) {
    composable("home") {
        HomeScreen(
            onMoviesClick = { navController.navigate("movies") },
            onLoginClick = { navController.navigate("login") },
        )
    }
    composable("movies") {
        MovieListScreen(
            onBackClick = { navController.popBackStack() },
            onMovieClick = { movieId -> navController.navigate("movies/$movieId") },
        )
    }
    composable(
        "movies/{movieId}?showHome={showHome}",
        arguments = listOf(
            navArgument("movieId") { type = NavType.StringType },
            navArgument("showHome") {
                type = NavType.BoolType
                defaultValue = true
            }
        ),
        deepLinks = listOf(
            navDeepLink {
                uriPattern = "moviesapp://movies/{movieId}?showHome={showHome}"
            }
        )
    ) { backStackEntry ->
        MovieDetailScreen(
            movieId = backStackEntry.arguments?.getString("movieId")!!,
            showHome = backStackEntry.arguments?.getBoolean("showHome")!!,
            onBackClick = { navController.popBackStack() },
            onHomeClick = { navController.popBackStack("home", false) },
        )
    }
    loginGraph(navController)
}
