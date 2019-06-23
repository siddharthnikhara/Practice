package com.demo.practice;

public class BubbleSort {
	
	public static void main(String[] args) {
		int a[]= {4,56,3,55,77,44,2,32};
		sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
