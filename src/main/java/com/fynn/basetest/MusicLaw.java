package com.fynn.basetest;

public class MusicLaw {
	public static String[] musicName = {
			"C",
			"#C",
			"D",
			"#D",
			"E",
			"F",
			"#F",
			"G",
			"#G",
			"A",
			"#A",
			"B"
};
	public static void main(String args[]){
		//五度相生法
		System.out.println("----------------十二平均律和五度相生法的比较----------------");
		System.out.println("----------------五律-平均律----------------");
		double[] wuLvArray2= new double[12];
		for(int i=0;i<12;i++){
			double outPrint = Math.pow(1.5, i);
			while(outPrint > 2){
				outPrint /= 2;
			}
			wuLvArray2[i] = outPrint;
		}
		
		double[] sortedWuLvArray = bubbleSort(wuLvArray2);
		
		//十二平均律和五度相生法的比较
		for(int i=0;i<12;i++){
			System.out.printf("%3s",i + 1 + ":");
			System.out.printf("%-10s",musicName[i]);
			System.out.printf("%18.17f",sortedWuLvArray[i]);
			System.out.print("-");
			System.out.printf("%18.17f",Math.pow(2, i/12.0));
			System.out.print("=");
			System.out.println((sortedWuLvArray[i] - Math.pow(2, i/12.0)) / Math.pow(2, i/12.0));
		}
	}
	
	public static double[] bubbleSort(double[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					double temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

		return array;
	}
}
