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
		System.out.println("----------------十二平均律和五度相生法的比较----------------");
		System.out.print("              A：五律");
		System.out.print("                      B：平均律");
		System.out.print("                      C：纯律");
		System.out.print("                            A-B");
		System.out.print("                A[i]/A[i-1]");
		System.out.print("     A[i]/A[i-1] - 平均律等比");
		System.out.println();
		
		/**********五律*************/
		double[] wuLvArray= new double[13];
		double outPrint;
		for(int i=0;i<12;i++){
			//其实就是三分音
			outPrint = Math.pow(3, i);
			while(outPrint > 2){
				outPrint /= 2;
			}
			wuLvArray[i] = outPrint;
		}
		wuLvArray[12] = 2;
		double[] sortedWuLvArray = bubbleSort(wuLvArray);
		
		/**********纯律*************/
		double[] chunLvArray= new double[13];
		//属音
		double shuYin;
		//中音
		double zhongYin;
		//主音
		double master = 1.0;
		chunLvArray[0] = master;
		
		for(int i=1;i<12;i += 2){
			//三分音
			shuYin = master * 3.0;
			while(shuYin > 2){
				shuYin /= 2.0;
			}
			
			//五分音
			zhongYin = master * 5.0; 
			while(zhongYin > 2){
				zhongYin /= 2.0;
			}
			
			chunLvArray[i] = shuYin;
			chunLvArray[i+1] = zhongYin;
			
			//以属音为主音继续循环
			master = shuYin;
		}
		chunLvArray[12] = 2.0;
		double[] sortedChunLvArray = bubbleSort(chunLvArray);
		
		
		//平均律、五律、纯律的比较
		for(int i=0;i<12;i++){
			System.out.printf("%3s",i + 1 + ":");
			System.out.printf("%-5s",musicName[i]);
			//五律比
			System.out.printf("%18.17f",sortedWuLvArray[i]);
			System.out.print("~");
			//平均律比
			System.out.printf("%18.17f",Math.pow(2, i/12.0));
			System.out.print("~");
			//纯律比
			System.out.printf("%18.17f",sortedChunLvArray[i]);
			System.out.print("~");
			
			//五律比-平均律比
			System.out.printf("%20.20f",(sortedWuLvArray[i] - Math.pow(2, i/12.0)));
			System.out.print("~");
			
			//五度相生律各音比
			if(i == 0){
				System.out.printf("%18s","null");
			}else{
				System.out.printf("%18.17f",sortedWuLvArray[i]/sortedWuLvArray[i - 1]);
				System.out.print("~");
				double result = sortedWuLvArray[i]/sortedWuLvArray[i - 1] - Math.pow(2, 1/12.0);
				if(result >=0 ){
					System.out.print(" ");
				}
				System.out.printf("%20.19f",result);
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
