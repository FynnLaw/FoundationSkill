package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月19日
 * @description 希尔排序-缩小增量排序 inner-space 
 * 当增量为1时即为插入排序
 */
public class ShellSortArithmetic {
	public static void main(String args[]) {
		int[] array = { 1, 3, 5, 2, 4, 6, 17, 87, 9, 36, 28 };
		int[] resultArray = shellSort(array);
		System.out.println(Arrays.toString(resultArray));
	}

	public static int[] shellSort(int[] array) {

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = 0; i < gap; i++) {
				for (int j = i; j < array.length; j += gap) {
					for (int k = j + gap; k < array.length; k += gap) {
						if (array[j] > array[k]) {
							int temp = array[k];
							array[k] = array[j];
							array[j] = temp;
						}
					}
				}
			}
		}

		return array;
	}
}
