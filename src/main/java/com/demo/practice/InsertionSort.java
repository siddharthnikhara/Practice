package com.demo.practice;

public class InsertionSort {
	
	public static void main(String[] args) {
		int a[] = { 4, 56, 3, 55, 77, 44, 2, 32 };
		sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}

}
