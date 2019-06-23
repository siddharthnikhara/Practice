package Practice.com.demo.practice;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int a[] = { 2, 7, 4, 1, 5, 3 ,9,11};
		bubbleSort.sort(a);
		for (int i =0;i<a.length;i++) {
			if(i==a.length-1)
			System.out.print(a[i] );
			else
				System.out.print(a[i]+ " ,");
		}

	}

	public int[] sort(int[] a) {
		int n =a.length;
		int temp =0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
