package com.example.FileManagementSystem;

public class FileProducer {

  public static void main(String[] args) {
    
    File textFile = new File("Steadforce rocks!", "text");
    File textFile1 = new File("Rossmann rocks!", "text");
    File byteFile = new File("0x53 0x74 0x65 0x61 0x64 0x66 0x6F 0x72 0x63 0x65", "binary");
    FileManagementSystem fileManager = new FileManagementSystem();

    fileManager.registerFileConsumer(textFile);
    fileManager.registerFileConsumer(textFile1);
    fileManager.registerFileConsumer(byteFile);

    fileManager.submitFile(textFile);

    fileManager.submitFile(byteFile);


  }
  
}
