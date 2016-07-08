package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月18日
 * @description merge two sorted array into one
 */
public class MergeTwoArrays {
	private static int[] array1 = { 1, 2, 5, 8, 9, 10 };
	private static int[] array2 = { 2, 4, 7, 8, 10, 12, 14, 20 };

	public static void main(String arg[]) {
		mergeTwoArray(array1, array2);
	}

	public static void mergeTwoArray(int[] array1, int[] array2) {
		System.out.println("Array1:" + Arrays.toString(array1));
		System.out.println("Array2:" + Arrays.toString(array2));

		int i = 0, j = 0, index = 0;
		int[] arrayTemp = new int[array1.length + array2.length];

		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) {
				arrayTemp[index++] = array1[i++];
			} else {
				arrayTemp[index++] = array2[j++];
			}
		}

		while (i < array1.length) {
			arrayTemp[index++] = array1[i++];
		}

		while (j < array2.length) {
			arrayTemp[index++] = array2[j++];
		}

		System.out.println("ResultArray:" + Arrays.toString(arrayTemp));
	}
}