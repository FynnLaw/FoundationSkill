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
		System.out.println("-------------------A:五律;B:平均律--------------------");
		System.out.print("                  A");
		System.out.print("                  B");
		System.out.print("                    A-B");
		System.out.print("              A[i+1]/A[i]");
		System.out.println();
		
		double[] wuLvArray2= new double[13];
		for(int i=0;i<12;i++){
			double outPrint = Math.pow(1.5, i);
			while(outPrint > 2){
				outPrint /= 2;
			}
			wuLvArray2[i] = outPrint;
		}
		wuLvArray2[12] = 2;
		
		double[] sortedWuLvArray = bubbleSort(wuLvArray2);
		
		//十二平均律和五度相生法的比较
		for(int i=0;i<12;i++){
			System.out.printf("%3s",i + 1 + ":");
			System.out.printf("%-5s",musicName[i]);
			//五律比
			System.out.printf("%18.17f",sortedWuLvArray[i]);
			System.out.print("~");
			//平均律比
			System.out.printf("%18.17f",Math.pow(2, i/12.0));
			System.out.print("~");
			//五律比-平均律比
			System.out.printf("%20.20f",(sortedWuLvArray[i] - Math.pow(2, i/12.0)));
			System.out.print("~");
			
			//五度相生律各音比
			if(i == 0){
				System.out.printf("%18s","null");
			}else{
				System.out.printf("%18.17f",sortedWuLvArray[i]/sortedWuLvArray[i - 1]);
			}
			
			
//			System.out.print("~");
//			if(sortedWuLvArray[i+1]/sortedWuLvArray[i] - Math.pow(2, 1/12.0) > 0)
//				System.out.print(" ");
//			System.out.printf("%20.20f",sortedWuLvArray[i]/sortedWuLvArray[i-1] - Math.pow(2, 1/12.0));
			
			System.out.println();
		}
		
		//五度相生律各音比
//		for(int i=0;i<11;i++){
//			System.out.println(sortedWuLvArray[i+1]/sortedWuLvArray[i]/Math.pow(2, 1/12.0));
//		}
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
