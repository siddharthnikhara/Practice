package Practice.com.demo.practice;

public class InsertionSortExample {
public static void main(String[] args) {
	int a[] = { 11, 4,12, 8, 17 };
	sort(a);
	for (int i : a) {
		System.out.print(i + " ");
	}
}

public static void sort(int a[]) {
	int n=a.length;
	for(int i=1;i<n-1;i++) {
		int j=i-1;
		int key=a[i];
		while(j>=0&&a[j]>key) {
			a[j+1]=a[j];
			j=j-1;
			
		}
		a[j+1]=key;
	}
}
}


