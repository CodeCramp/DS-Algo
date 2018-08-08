package com.codecramp.algo.sorting;

public class QuickSort {
  
  public void sort(int arr[], int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      
      // Recursively sort the two halves
      sort(arr, low, partitionIndex - 1);
      sort(arr, partitionIndex + 1, high);
    }
  }
  
  /*
   * Takes the last element as pivot, places the pivot element at its correct position in
   * sorted array, and places all smaller (than pivot) to left of pivot and all greater
   * elements to right of pivot.
   */
  private int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int pIndex = low; // index of smaller element (initially 0)
    for (int i = low; i < high; i++) {
      if (arr[i] <= pivot) {
        swap(arr, pIndex, i); // swap arr[i] and arr[pIndex]
        pIndex++;
      }
    }
    swap(arr, pIndex, high); // swap arr[pIndex] and arr[high]
    return pIndex;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }
}
