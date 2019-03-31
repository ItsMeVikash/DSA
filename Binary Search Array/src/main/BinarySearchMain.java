package main;

public class BinarySearchMain {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10 };
		int high = arr.length, key = 9;

		int result = binarySearch(arr, 0, high, key);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("found at index " + result);
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {
		if (high < low)
			return -1;

		int mid = (low + high) / 2;

		if (key == arr[mid])
			return mid;

		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);

		if (key < arr[mid])
			return binarySearch(arr, low, (mid - 1), key);

		return -1;

	}

}
