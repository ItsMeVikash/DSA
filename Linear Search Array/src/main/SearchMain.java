package main;

public class SearchMain {

	public static void main(String[] args) {
		int arr[]= {11,12,13,15,52,158};
		int element_to_be_searhed=52;
		int res=linearSearch(arr,element_to_be_searhed);
		if(res==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at "+(res+1));

	}

	private static int linearSearch(int[] arr, int element_to_be_searhed) {
		for (int i = 0; i < arr.length; i++) {
			if (element_to_be_searhed==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
