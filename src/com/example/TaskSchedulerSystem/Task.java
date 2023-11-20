package com.example.TaskSchedulerSystem;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Task {

  List<String> logList = new ArrayList<>();

  private int IDcounter = 1000;

  private int taskID;
  private String name;
  private String description;
  private Date executionTime;
  // private LocalDateTime localDateTime;

  public Task(String name, String description) {
    this.taskID = generateTaskIdCounter();
    this.name = name;
    this.description = description;
    this.executionTime = new Date();
    // this.localDateTime = LocalDateTime.now();
  }

  private int generateTaskIdCounter() {
    return ++IDcounter;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Date getExecutionTime() {
    return executionTime;
  }

  public int getTaskID() {
    return taskID;
  }

  public int getFrequency(int frequency) {
    return frequency;
  }

  public List<String> getLogList() {
    return logList;
  }


  public void scheduledTask(List<LocalDateTime> dateList) {
    // good!!!

    for (LocalDateTime date : dateList) {
      while (true) {
        LocalDateTime now = LocalDateTime.now();
        if (now.compareTo(date) > 0) {
          System.out.println("Database backup has been performed at: " + date);
          logList.add("Database backup has been performed at: " + date);
          break;
        }
      }
    }
  }


  public void oneTimeTask(Time specTime) {
    System.out.println("Email was sent at " + specTime);
  }


  public void recurringTask(long timeInterval) {
    // final long timeInterval = 1000;

    Runnable runnable = new Runnable() {
      public void run() {
        while (true) {
          System.out.println("Report has been generated.");
          try {
            Thread.sleep(timeInterval);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    Thread thread = new Thread(runnable);
    thread.start();
  }
}
