package com.fynn.basetest;

public class MusicLawCaculate {
	public static double[] tempArray = new double[13];
	
	public static void main(String args[]){
		for(int a=0;a<5;a++){
			System.out.println("----------第" + (a+1) + "组--------------");
			for(int i=a*12;i<a*12 + 12;i++){
				double temp = Math.pow(3, i);
				while(temp > 2){
					temp /= 2.0;
				}
				System.out.println(i + 1 + ":" + temp);
			}
		}
	}
}
