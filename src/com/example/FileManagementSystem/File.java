package com.example.FileManagementSystem;

import java.time.LocalDateTime;
public class File {

  private static int idCounter = 0;

  private String type;
  private int id;
  private LocalDateTime zeitstempel;
  private String content;

  public File(String content, String type) {
    this.id = createID();
    this.type = type;
    this.zeitstempel = LocalDateTime.now();
    this.content = content;
  }

  public int getID() {
    return id;
  }

  public String getType() {
    return type;
  }

  public int createID() {
    return ++idCounter;
  }

  public void consumer() {
    if (type.equals("text")) {
      System.out.println(id + " " + zeitstempel + " " + content);

    } else if (type.equals("binary")) {

      String[] tokens = content.split(" ");
      String result = "";
      
      for(String token : tokens)
      {
          int temp = Integer.parseInt(token.substring(2, 4), 16);
          char c = (char)temp;
          // System.out.print(c);
          result += c;
      }
      System.out.println(id + " " + zeitstempel + " " + result.length() + " " + result.substring(0, 4));

    }
  }
  
}
