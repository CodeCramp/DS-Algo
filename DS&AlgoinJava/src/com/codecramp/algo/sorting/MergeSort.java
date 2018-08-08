package com.codecramp.algo.sorting;

public class MergeSort {

  public void sort(int[] arr) {
    int[] aux = new int[arr.length];
    mergesort(arr, aux, 0, arr.length - 1);
  }

  private void mergesort(int[] arr, int[] aux, int lo, int hi) {
    // check if low is smaller than high, if not then the array is sorted
    if (lo < hi) {
      // Get the index of the element which is in the middle
      int mid = lo + (hi - lo) / 2;
      // Sort the left array
      mergesort(arr, aux, lo, mid);
      // Sort the right array
      mergesort(arr, aux, mid + 1, hi);
      // Combine
      merge(arr, aux, lo, mid, hi);
    }
  }

  private void merge(int[] arr, int[] aux, int lo, int mid, int high) {

    for (int i = lo; i <= high; i++) {
      aux[i] = arr[i];
    }

    int i = lo;
    int j = mid + 1;
    int k = lo;
    while (i <= mid && j <= high) {
      if (aux[i] <= aux[j]) { // If left array has smaller element
        arr[k] = aux[i]; 
        i++;
      } else { // If right array has the smaller element
        arr[k] = aux[j];
        j++;
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= mid) {
      arr[k] = aux[i];
      k++;
      i++;
    }
  }
}
