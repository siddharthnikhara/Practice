package Practice.com.demo.practice;

public class SelectionSort {
	
	public static void main(String[] args) {
		int a[] = { 11, 4,12, 8, 17 };
		sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int arr[]) {
			for(int i=0;i<arr.length-1;i++) {
				int min_index=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[min_index]) {
						min_index=j;
					}
				}
				int temp=arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			}
	}

}
