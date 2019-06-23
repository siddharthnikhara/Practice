package Practice.com.demo.practice;

public class BubbleSortExample {
	void sort(int arr[]) {
		int n = arr.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			System.out.println(arr[i]);
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					System.out.print(min_idx+"   ;");
					min_idx = j;
				}
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			System.out.print(arr[i]+ "   /  ");
			arr[i] = temp;
			System.out.println();
			System.out.print(arr[i]);
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	// Driver code to test above
	public static void main(String args[]) {
		BubbleSortExample ob = new BubbleSortExample();
		int arr[] = { 64, 65, 67, 69, 63 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
