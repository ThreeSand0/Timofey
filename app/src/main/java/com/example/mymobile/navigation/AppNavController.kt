package com.example.mymobile.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mymobile.presentation.pages.TodoScreen
import com.example.mymobile.presentation.pages.Todolist


@Composable
fun AppNavController(){
    val NavController = rememberNavController()
    NavHost(navController = NavController, startDestination = Screen.TodoListScreen.route ) {
        composable(route = Screen.TodoListScreen.route){
            Todolist(navController = NavController)
        }
        composable(
            route = Screen.TodoScreen.route + "/{title}/{description}",
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = null
                    nullable = true
                },
                navArgument("description") {
                    type = NavType.StringType
                    defaultValue = null
                    nullable = true
                }
            ),

        ) {
            TodoScreen(
                title = it.arguments?.getString("title"),
                subtitle = it.arguments?.getString("description"),
                navController = NavController
            )
        }
    }
}

