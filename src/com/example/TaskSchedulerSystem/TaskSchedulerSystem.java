package com.example.TaskSchedulerSystem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TaskSchedulerSystem {
  
  public static void main(String[] args) {

    List<LocalDateTime> dateTimeList = new ArrayList<>();

    String dateTimeString1 = "2023-09-26T23:03:51.000000001";
    LocalDateTime dateTime1 = LocalDateTime.parse(dateTimeString1);
    String dateTimeString2 = "2023-09-26T23:03:31.000000001";
    LocalDateTime dateTime2 = LocalDateTime.parse(dateTimeString2);

    dateTimeList.add(dateTime1);
    dateTimeList.add(dateTime2);

    Collections.sort(dateTimeList);
    System.out.println(dateTimeList);
    
    TaskScheduler taskScheduler = new TaskScheduler();
    
    Task task1 = taskScheduler.createTask("PythonTask", "one-time");
    Task task2 = taskScheduler.createTask("JavaTask", "recurring");
    Task task3 = taskScheduler.createTask("C++Task", "scheduled");




    //task1.recurringTask(2000);
    task2.scheduledTask(dateTimeList);
    // task3.oneTimeTask(null);
    // System.out.println("Log List: ");
    System.out.println("Log List: " + task2.getLogList());
  }

}
