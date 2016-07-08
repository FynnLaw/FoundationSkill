package com.fynn.arithmetics;

import java.util.Arrays;

/**
 * 
 * @author FynnLaw
 * @time 2016年6月18日
 * @description 插入算法 stable,inner-space,O(n)~O(n2)
 * 将新数插入到已经排好序的序列
 */
public class InsertSortArithmetic {
	public static void main(String arg[]){
		int[] array = {1,3,5,7,2,4,6,8};
		int[] resultArray = insertSort(array);
		System.out.println(Arrays.toString(resultArray));
	}
	
	public static int[] insertSort(int[] array){
		for(int i = 0;i < array.length - 1;i++){
			for(int j = 0;j <= i;j++){
				if(array[i + 1] < array[j]){
					int temp = array[j];
					array[j] = array[i + 1];
					array[i + 1] = temp;
				} 
			}
		}
		
		return array;
	}
}
