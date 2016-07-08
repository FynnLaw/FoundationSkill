package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月18日
 * @description 选择排序 O(n2) stable inner-space 选出最小的放在第一位，在剩余部分选出最小的放在第二位，以此类推
 */
public class SelectSortArithmetic {
	public static void main(String args[]) {
		int[] array = { 5, 4, 3, 2, 1, 5, 7, 9, 5, 2, 3, 1, 65, 23, 14, 3 };
		int[] array1 = { 5, 4, 3, 2, 1, 5, 7, 9, 5, 2, 3, 1, 65, 23, 14, 3 };
		int[] resultArray = selectSort(array);
		System.out.println(Arrays.toString(resultArray));

		int[] resultArray1 = selectSortImprove(array1);
		System.out.println(Arrays.toString(resultArray1));
	}

	public static int[] selectSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		return array;
	}

	public static int[] selectSortImprove(int[] array) {

		for (int i = 0; i < array.length / 2; i++) {
			int minIndex = i;
			int maxIndex = i;
			int temp;
			for (int j = i + 1; j < array.length - i; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
					continue;
				}

				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}

			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			//最大值的位置有移动的可能
			if (maxIndex == i) {
				maxIndex = minIndex;
			}

			temp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[maxIndex];
			array[maxIndex] = temp;
		}

		return array;
	}
}
