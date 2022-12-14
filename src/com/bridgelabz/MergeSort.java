package com.bridgelabz;

public class MergeSort {
	 void merge(int arr[], int l, int m, int r) {
	        // Find sizes of two subarrays to be merged
	        int number1 = m - l + 1;
	        int number2 = r - m;

	        /* Create temp arrays */
	        int Left[] = new int[number1];
	        int Rigth[] = new int[number2];

	        /*Copy data to temp arrays*/
	        for (int i = 0; i < number1; ++i)
	            Left[i] = arr[l + i];
	        for (int j = 0; j < number2; ++j)
	            Rigth[j] = arr[m + 1 + j];

	        /* Merge the temp arrays */

	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;

	        // Initial index of merged subarray array
	        int k = l;
	        while (i < number1 && j < number2) {
	            if ( Left[i] <= Rigth[j]) {
	                arr[k] = Left[i];
	                i++;
	            } else {
	                arr[k] = Rigth[j];
	                j++;
	            }
	            k++;
	        }

	        /* Copy remaining elements of L[] if any */
	        while (i < number1) {
	            arr[k] =  Left[i];
	            i++;
	            k++;
	        }

	        /* Copy remaining elements of R[] if any */
	        while (j < number2) {
	            arr[k] = Rigth[j];
	            j++;
	            k++;
	        }
	    }

	    void sort(int arr[], int l, int r) {


	        if (l < r) {
	            // Find the middle point
	            int m = l + (r - l) / 2;

	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);

	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }

	    /* A utility function to print array of size n */
	    static void printArray(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	    // Driver code
	    public static void main(String args[]) {
	        int arr[] = {12, 11, 13, 5, 6, 7};

	        System.out.println("Given Array");
	        printArray(arr);

	        MergeSort ob = new MergeSort();
	        ob.sort(arr, 0, arr.length - 1);

	        System.out.println("\nSorted array");
	        printArray(arr);
	    }
	}

