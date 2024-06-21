package com.example.to_do

interface TaskItemClickListener {

    fun editTaskItem(taskItem : TaskItem)
    fun completeTaskItem(taskItem : TaskItem)
    fun deleteTaskItem(taskItem : TaskItem)

}