package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月18日
 * @description 归并算法
 */
public class MergeSortArithmetic {
	public static void main(String args[]) {
		int[] numArray = { 3, 2, 1, 9, 8, 5, 3, 5 };
		int[] tempArray = mergeSort(numArray);
		System.out.println(Arrays.toString(tempArray));
	}

	public static int[] mergeSort(int[] array) {
		return mergeSort(array, 0, array.length - 1);
	}

	public static int[] mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}

		return array;
	}

	public static void merge(int[] array, int left, int middle, int right) {

		int[] tempArray = new int[right - left + 1];

		int i = left;
		int j = middle + 1;
		int index = 0;

		while (i <= middle && j <= right) {
			if (array[i] < array[j]) {
				tempArray[index++] = array[i++];
			} else {
				tempArray[index++] = array[j++];
			}
		}

		while (i <= middle) {
			tempArray[index++] = array[i++];
		}

		while (j <= right) {
			tempArray[index++] = array[j++];
		}

		int k = 0;
		while (k < tempArray.length) {
			array[left + k] = tempArray[k++];
		}
	}
}
