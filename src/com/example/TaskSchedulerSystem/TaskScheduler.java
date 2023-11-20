package com.example.TaskSchedulerSystem;

import java.util.ArrayList;
import java.util.List;

class TaskScheduler {

  private List<Task> taskList;

  public TaskScheduler() {
    taskList = new ArrayList<>();
  }
  
  public Task createTask(String name, String description) {
    Task newTask = new Task(name, description);
    taskList.add(newTask); 
    return newTask;
  }
  
}
