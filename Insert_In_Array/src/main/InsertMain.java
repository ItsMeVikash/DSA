package main;

import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int array_size = scanner.nextInt();
		int arr[] = new int[array_size + 1];
		// array size will be size+1 bcoz we have to insert one element
		for (int i = 0; i < array_size; i++) {
			arr[i] = scanner.nextInt();
		}
		int elementToInsert = 40;
		int position = 4;// fixing the position u can take input from user
		System.out.println("Before Insertion");
		for (int i = 0; i < array_size; i++) {
			System.out.print(arr[i] + "\t");
		}

		int res[] = insertAtPosition(arr, elementToInsert, position);
		System.out.println("\nAfter Insertion\n");
		for (int i = 0; i < res.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		scanner.close();
	}

	private static int[] insertAtPosition(int[] arr, int elementToInsert, int position) {
		for (int i = arr.length - 2; i >= (position - 1); i--) {
			arr[i + 1] = arr[i];
		}
		arr[position - 1] = elementToInsert;

		return arr;
	}

}