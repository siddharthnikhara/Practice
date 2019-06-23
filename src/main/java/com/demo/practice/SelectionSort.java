package com.demo.practice;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 4, 56, 3, 55, 77, 44, 2, 32 };
		sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]<a[min_index]) {
					min_index=j;
				}
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		
		
	}
}
