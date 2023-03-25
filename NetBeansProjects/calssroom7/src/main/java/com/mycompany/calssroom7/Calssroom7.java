/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calssroom7;

import static com.mycompany.calssroom7.BinarySearch.runBinarySearchIteratively;
import static com.mycompany.calssroom7.BubbleSort.bubbleSort;

/**
 *
 * @author STBOLH
 */
public class Calssroom7 {

    public static void main(String[] args) {
        //Binary search
    int[] sortedArray = {1, 3, 5, 7, 9};
    int key = 5;
    int low = 0;
    int high = sortedArray.length - 1;
    int index = runBinarySearchIteratively(sortedArray, key, low, high);
    System.out.println("Index of " + key + " is: " + index);
    
    //Bubble sort
    int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
        bubbleSort(arr, arr.length); 
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    
    }
}
