package com.example.mymobile.presentation.pages.view_model

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.mymobile.domain.entity.TodoEntity

class TodoListViewModel() : ViewModel(){
    var todoList = mutableStateListOf(
        TodoEntity(
            title = "Сходить на пару",
            subtitle = "ходить на прау по налийскому языку"
        ),
        TodoEntity(
            title = "Сходить на пару",
            subtitle = "ходить на прау по налийскому языку"
        ),
        TodoEntity(
            title = "Сходить на пару",
            subtitle = "ходить на прау по налийскому языку"
        ),
        TodoEntity(
            title = "Сходить на пару",
            subtitle = "ходить на прау по налийскому языку"
        ),
        TodoEntity(
            title = "Сходить на пару",
            subtitle = "ходить на"
        )
    )


    fun addTodo(todo: TodoEntity) {
        todoList.add(TodoEntity(title = todo.title, subtitle = todo.subtitle, id = todoList.size))
    }
    fun deleteTodo(id: Int) {

    }
    fun editTodo(todo: TodoEntity){

    }
}