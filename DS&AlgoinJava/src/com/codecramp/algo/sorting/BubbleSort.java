package com.codecramp.algo.sorting;

public class BubbleSort {

  public void sort(int[] arr) {
    for (int i = arr.length - 1; i > 1; i--) {
      for(int j = 0; j < i; j++) {
        if(arr[j] > arr[j+1]) { // The idea is to put the smallest item at the beginning of the array.
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
