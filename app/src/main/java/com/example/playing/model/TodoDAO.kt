package com.example.playing.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDAO {

    @Query("SELECT * FROM todo_items")
    fun getAll(): LiveData<List<TodoEntity>>

    @Query("SELECT * FROM todo_items WHERE title LIKE :title")
    fun findByTitle(title: String): TodoEntity

    @Insert
    fun insertAll(vararg todo: TodoEntity)

    @Delete
    fun delete(todo: TodoEntity)

    @Update
    fun updateTodo(vararg todo: TodoEntity)
}