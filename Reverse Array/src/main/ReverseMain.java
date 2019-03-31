package main;

public class ReverseMain {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("\nAfter Insertion");
		arr = reverseArray(arr);
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}

	private static int[] reverseArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			i++;
		}
		return arr;
	}

}
