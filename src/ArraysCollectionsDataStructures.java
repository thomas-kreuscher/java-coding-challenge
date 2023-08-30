// package com.journaldev.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCollectionsDataStructures {

  // 99. Sorting an array: Write several programs
  // that exemplify different sorting algorithms for arrays.
  // Also, write a program for shuffling arrays.

  public static void ShuffleArray(Integer[] intArray) {

    List<Integer> intList = Arrays.asList(intArray);

    Collections.shuffle(intList);

    intList.toArray(intArray);

    System.out.println(Arrays.toString(intArray));
  }


  public static void main(String[] args) {

    Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
    ShuffleArray(intArray);
  }
}
