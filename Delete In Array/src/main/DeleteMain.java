package main;

public class DeleteMain {

	public static void main(String[] args) {
		int arr[] = { 10, 50, 30, 40, 20 };
		int key = 30;
		int n=arr.length;
		System.out.println("Array before deletion");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		n = deleteElement(arr, n, key);

		System.out.println("\n\nArray after deletion");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static int deleteElement(int[] arr, int n, int key) {
		// Find position of element to be deleted
		int pos = findElement(arr, n, key);

		if (pos == -1) {
			System.out.println("Element not found");
			return n;
		}

		// Deleting element
		for (int i = pos; i < n - 1; i++)
			arr[i] = arr[i + 1];

		return n - 1;
	}

	private static int findElement(int[] arr, int n, int key) {
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	}

}
