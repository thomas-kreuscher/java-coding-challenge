package com.example.NotenVerwaltungsSystem;

import java.util.HashMap;
import java.util.Map;

public class Student {

  private int matrikelNo;
  private String name;

  private Map<String,Integer> subjects;

  public Student(int matrikelNo, String name) {
    this.matrikelNo = matrikelNo;
    this.name = name;
    this.subjects = new HashMap<>();
  }

  public int getMatNo() {
    return matrikelNo;
  }

  public String getName() {
    return name;
  }

  public void setSubjectMark(String subject, Integer mark) {
    subjects.put(subject, mark);
  }

  public Map<String,Integer> getSubjectMark() {
    return subjects;
  }

}