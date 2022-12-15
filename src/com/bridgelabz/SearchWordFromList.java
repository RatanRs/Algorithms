package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class SearchWordFromList {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String paragraph = "Java array is an object which contains elements of a similar data type";
		String[] array = paragraph.toLowerCase().split(" ");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String word = input.next();

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "-->" + array[i] + " ");
		}
		System.out.println();

		if (Arrays.binarySearch(array, word) >= 0) {
			System.out.println(word + " is contains in the array list");
		} else {
			System.out.println(word + " is not contains in the array list");
		}
	}
}
