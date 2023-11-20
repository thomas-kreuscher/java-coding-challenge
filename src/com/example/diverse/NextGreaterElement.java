package com.example.diverse;
public class NextGreaterElement {

  // int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
  // result = 1 : 2 | 2 : 3 | 3 : 4 | 4 : 12 | 12 : -1 | 2 : 4 | 1 : 4 | 4 : -1

  public static void nextGreaterElem(int[] arr) {
    for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
      System.out.println("----------------");
      System.out.println("i: " + i + " and j: " + j);
      System.out.println("----------------");
      if (i < j && arr[i] < arr[j]) {
        System.out.println(arr[i] + " : " + arr[j]);
        // continue;
        // break;
      } else if (j == arr.length - 1) {
        j--;

      } else {
        j++;
        System.out.println(arr[i] + " : -1 ");
      }
    }
  }

  // int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
  // result = 1 : 2 | 2 : 3 | 3 : 4 | 4 : 12 | 12 : -1 | 2 : 4 | 1 : 4 | 4 : -1

  public static void nextGreaterElem1(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println("----------------");
        System.out.println("i: " + i + " and j: " + j);
        System.out.println("----------------");
        if (arr[i] < arr[j]) {
          System.out.println(arr[i] + " : " + arr[j]);
          i++;
        } else if ((arr[i] > arr[j]) && (j == arr.length - 1)) {
          System.out.println(arr[i] + " : -1 ");
        } else {
          continue;
        }
      }
    }
  }

  // int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
  // result = 1 : 2 | 2 : 3 | 3 : 4 | 4 : 12 | 12 : -1 | 2 : 4 | 1 : 4 | 4 : -1

  public static void nextGreaterElem2(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int cge = -1;
      for (int j = i + 1; j < arr.length; j++) {
        // System.out.println("----------------");
        // System.out.println("i: " + i + " and j: " + j);
        // System.out.println("----------------");
        if (arr[i] < arr[j]) {
          cge = arr[j];
          break;
        }
      }
      System.out.println(arr[i] + " : " + cge);
      
    }
  }

  public static void println(int[] arr) {
    int nge;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      nge = -1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] < arr[j]) {
          nge = arr[j];
          break;
        }
      }
      System.out.println(arr[i] + " : " + nge);
    }
  }

  public static void main(String[] args) {
    int[] integers = { 1, 2, 3, 4, 12, 2, 1, 4 };
    nextGreaterElem2(integers);
    System.out.println("----------------");
    println(integers);
  }

}
