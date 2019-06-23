package Practice.com.demo.practice;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 3, 1, 55, 99, 11 };
		QuickSort sort = new QuickSort();
		int length = arr.length;
		sort.sort(arr, 0, length - 1);
		for (int i : arr) {
			System.out.print(i + " ,");
		}
	}

	public int[] sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
		return arr;
	}

	public int partition(int a[], int low, int high) {
		int pivot=a[high];	
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		
		return i+1;
	}
}
