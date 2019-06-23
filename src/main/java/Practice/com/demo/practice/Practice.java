package Practice.com.demo.practice;

public class Practice {

	public static void main(String[] args) {
		int a[] = { 11, 12, 12, 22, 11 };
		sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
