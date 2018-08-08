package com.codecramp.algo.sorting;

import static com.codecramp.utils.Util.printArray;

/**
 * Demonstrates various sorting algorithms.
 */
public class SortingDemo {

    public static void main(String args[]) {
      int arrOne[] = {12, 11, 13, 5, 6, 7};
      int arrTwo[] = {6, 12, 6, 13, 5, 7, 11};
      int arrThree[] = {11, 12, 6, 13, 5, 7};
      int arrFour[] = {18, 8, 90, 98, 9, 0, 100, -1, 999, 43, 18, -89};
      int arrFive[] = {18, 8, 90, 98, 9, 0, 100, -1, 999, 43, 18, -89};

      System.out.println("Given Arrays:");
      printArray(arrOne);
      printArray(arrTwo);
      printArray(arrThree);
      printArray(arrFour);
      printArray(arrFive);
      
      System.out.println("\nSorted array using Bubble Sort");
      BubbleSort bs = new BubbleSort();
      bs.sort(arrOne);
      printArray(arrOne);
      
      System.out.println("\nSorted array using Selection Sort");
      SelectionSort ss = new SelectionSort();
      ss.sort(arrTwo);
      printArray(arrTwo);

      System.out.println("\nSorted array using Insertion Sort");
      InsertionSort is = new InsertionSort();
      is.sort(arrThree);
      printArray(arrThree);
      
      System.out.println("\nSorted array using Merge Sort");
      MergeSort ms = new MergeSort();
      ms.sort(arrFour);
      printArray(arrFour);
      
      System.out.println("\nSorted array using Quick Sort");
      QuickSort qs = new QuickSort();
      qs.sort(arrFive, 0, arrFive.length - 1);
      printArray(arrFive);
    }
}
