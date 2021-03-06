package main;

public class PrintLadder {
/*
 * An element is leader if it is greater than all the elements to its right side. 
 * And the rightmost element is always a leader. 
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 */
	public static void main(String[] args) {
		int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
		printLadders(arr);
		
	}

	private static void printLadders(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					if(j==arr.length-1)
						System.out.println(arr[i]);
				}else {
					break;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
	}

}
