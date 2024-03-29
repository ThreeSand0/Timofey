package com.example.mymobile.navigation

sealed class Screen(val route: String) {

    object  TodoModule: Screen("todo")
    object TodoListScreen : Screen("todo_list_screen")
    object TodoScreen : Screen("todo_screen")
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
    }
}