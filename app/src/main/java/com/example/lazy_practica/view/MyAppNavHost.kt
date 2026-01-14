package com.example.lazy_practica.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lazy_practica.nav.Routes

@Composable
fun MyAppNavHost(modifier: Modifier = Modifier) {
    val navigationController = rememberNavController()
    
    NavHost(
        navController = navigationController,
        startDestination = Routes.DogList.route
    ) {
        composable(Routes.DogList.route) {
            LazyColumnDogs(Modifier, navigationController)
        }
        
        composable(
            Routes.DetailScreen.route,
            arguments = listOf(navArgument("dogName") { type = NavType.StringType })
        ) { backStackEntry ->
            DetailScreen(
                navigationController,
                backStackEntry.arguments?.getString("dogName") ?: "",
                Modifier
            )
        }
    }
}
