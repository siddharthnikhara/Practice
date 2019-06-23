package com.demo.practice;

public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 4, 56, 3, 55, 77, 44, 2, 32 };
		sort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static int[] sort(int a[], int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
		return a;
	}

	public static int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}
}
