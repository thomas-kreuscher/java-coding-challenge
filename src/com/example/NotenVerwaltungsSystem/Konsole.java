package com.example.NotenVerwaltungsSystem;

public class Konsole {

  public static void main(String[] args) {

    Student stud1 = new Student(2345435, "Thomas");
    Student stud2 = new Student(2345436, "Thorsten");
    Student stud3 = new Student(2345437, "Susanne");

    stud1.setSubjectMark("Deutsch", 3);
    stud1.setSubjectMark("Mathe", 2);
    stud1.setSubjectMark("IT", 5);

    stud2.setSubjectMark("Deutsch", 1);
    stud2.setSubjectMark("Mathe", 3);
    stud2.setSubjectMark("IT", 6);

    stud3.setSubjectMark("Deutsch", 1);
    stud3.setSubjectMark("Mathe", 2);
    stud3.setSubjectMark("IT", 4);

    // System.out.println(stud1.getMatNo());

    NotenVerwaltungsSystem markSystem = new NotenVerwaltungsSystem();

    markSystem.addStudToMap(stud1);
    markSystem.addStudToMap(stud2);
    markSystem.addStudToMap(stud3);





    System.out.println("MARKS OF STUDENTS: "); 
    markSystem.showStudMap();

    stud1.setSubjectMark("Mathe", 4);
    stud1.setSubjectMark("Ethik", 1);
    stud1.setSubjectMark("Sport", 1);

    System.out.println("MARKS OF STUDENTS: "); 
    markSystem.showStudMap();

    // System.out.println("AVERAGE MARK: ");
    // markSystem.calcAvgMark(stud1); 

    markSystem.calcMinMaxMark(stud1);


    markSystem.drawHistogram(stud1);


    
  }
  
}
