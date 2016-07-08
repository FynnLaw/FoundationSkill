package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月18日
 * @description 冒泡排序 inner-space stable O(n2)
 * 与选择排序相比,不选车最小的就进行移动,选择排序是比较出最小的再移动
 */
public class BubbleSortArithmetic {
	public static void main(String args[]) {
		int[] numArray = { 3, 2, 1, 9, 8, 5, 3, 5 };
		int[] tempArray = bubbleSort(numArray);
		System.out.println(Arrays.toString(tempArray));
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

		return array;
	}
}
