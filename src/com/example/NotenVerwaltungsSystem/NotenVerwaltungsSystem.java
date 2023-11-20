package com.example.NotenVerwaltungsSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotenVerwaltungsSystem {

  private List<Student> studentList = new ArrayList<>();

  public void addStudToMap(Student stud) {
    studentList.add(stud);
  }

  public void showStudMap() {

    // report of all students mark´s and there avg mark

    for (Student stud : studentList) {
      System.out.println(stud.getName() + " " + stud.getMatNo() + " " + stud.getSubjectMark());
      calcAvgMark(stud);
    }
  }


  public void calcAvgMark(Student stud) {

  // calculate avg mark of stud or avg of all studs

    Integer sum = stud.getSubjectMark().values().stream().mapToInt(d -> d).sum();
    Integer count = stud.getSubjectMark().size();
    float avg = (float) sum / count;
    System.out.println("Average mark: " + Math.round(avg * 10.0) / 10.0);
  }


  public void calcMinMaxMark(Student stud) {

  // show best and most worse mark of each student or in general

    Integer minValue = stud.getSubjectMark().entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
    Integer maxValue = stud.getSubjectMark().entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
    System.out.println("Best mark of " + stud.getName() + ": " + minValue);
    System.out.println("Worst mark of " + stud.getName() + ": " + maxValue);
  }

  
  public void drawHistogram(Student stud) {

    // markdistribution: dsiplay histogram of all marks

    Map<Integer, Integer> histogram = new HashMap<>();

    for (Integer value : stud.getSubjectMark().values()) {
      if (value instanceof Integer) {
        histogram.put(value, histogram.getOrDefault(value, 0) + 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
      System.out.println("Mark: " + entry.getKey() + ", Occurrences: " + entry.getValue());
    }
  }
}




    // SortedSet<Integer> values = new
    // TreeSet<Integer>(stud.getSubjectMark().values());
    // for (Integer value : values) {
    // System.out.print(value + " : ");
    // for (int i = 0; i < stud.getSubjectMark().size(); i++) {
    // if ()
    // System.out.print("*");
    // }
    // System.out.println();
    // }

// public void showMarksMap() {
// for(Map.Entry<Integer, Map<String, Float>> entry : marksMap.entrySet()) {
// System.out.println(entry);
// }
// }

// public void addMarksToStud(Student stud, String subject, int mark) {
// innerMarksMap.put(subject, mark);
// marksMap.put(stud.getMatNo(), innerMarksMap);
// }

// public void addMarksToStud(Student stud, String subject, int mark) {

// if (marksMap != null) {
// for (Map.Entry<Integer, Map<String, Integer>> entry : marksMap.entrySet()) {

// Integer matNo = entry.getKey();
// Map<String, Integer> markToSubject = entry.getValue();

// if ((matNo == stud.getMatNo()) && (matNo != null)) {

// for (Map.Entry<String, Integer> entryy : markToSubject.entrySet()) {
// String subjectt = entryy.getKey();
// Integer markk = entryy.getValue();

// System.out.println("mark added");
// markToSubject.put(subjectt, markk);

// }
// System.out.println("null value");
// }

// }
// } else {
// innerMarksMap.put(subject, mark);
// marksMap.put(stud.getMatNo(), innerMarksMap);
// //System.out.println("mark and subject added to stud.");

// }
// }

// public void addMarksToStud(Student stud, String subject, int mark) {

// if (marksMap != null) {
// for (Map.Entry<Integer, Map<String, Integer>> entry : marksMap.entrySet()) {

// Integer matNo = entry.getKey();
// Map<String, Integer> markToSubject = entry.getValue();

// if ((matNo == stud.getMatNo()) && (matNo != null)) {

// for (Map.Entry<String, Integer> entryy : markToSubject.entrySet()) {
// String subjectt = entryy.getKey();
// Integer markk = entryy.getValue();

// System.out.println("mark added");
// markToSubject.put(subjectt, markk);

// }
// System.out.println("null value");
// }

// }
// } else {
// innerMarksMap.put(subject, mark);
// marksMap.put(stud.getMatNo(), innerMarksMap);
// //System.out.println("mark and subject added to stud.");

// }
// }

// add student & mat.-no

// public void addStudToMap(Student stud) {
// innerMapKey.put(stud.getMatNo(), stud.getName());
// studentMap.put(innerMapKey,innerMapVal);
// }

// add marks to student

// public void addMarksToStud(Student stud, String subject, int mark) {
// for (Map<Integer,String> key : studentMap.keySet()) {
// if (key.containsKey(stud.getMatNo())) {
// innerMapVal.put(subject, mark);
// studentMap.values().add(innerMapVal);
// }
// }
// }
