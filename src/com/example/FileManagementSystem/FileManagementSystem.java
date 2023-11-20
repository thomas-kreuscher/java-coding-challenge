package com.example.FileManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class FileManagementSystem {

  List<File> consumerList = new ArrayList<>();

  public void registerFileConsumer(File file) {
    consumerList.add(file);
    System.out.println("Consumer of type " + file.getType() + " and ID " + file.getID() + " added to list content: " + consumerList);
  }



  public void submitFile(File file) {
    file.consumer();


  }
  
}
