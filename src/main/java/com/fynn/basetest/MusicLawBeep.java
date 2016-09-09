package com.fynn.basetest;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.exceptions.NativeException;
/**
 * @author user
 * 要求：jdk1.8 32位
 */
public class MusicLawBeep {
	public static void main(String args[]) throws IllegalAccessException, NativeException{
		int[] yinLv = new int[]{1,3,5,6,8,10,12,13};
		double[] pingJunLvArray = new double[13];
		double[] wuLvArray = new double[13];
		for(int i=0;i<=12;i++){
			//平均律
			double pingJunLv = Math.pow(2, i/12.0);
			pingJunLvArray[i] = pingJunLv;
			
			//五律
			double wuLv = Math.pow(3, i);
			while(wuLv > 2 && i<12){
				wuLv /= 2;
			}
			wuLvArray[i] = wuLv;
		}
		wuLvArray[12] = 2;
		double[] sortedPingJunLvArray = MusicLaw.bubbleSort(pingJunLvArray);
		double[] sortedWuLvArray = MusicLaw.bubbleSort(wuLvArray);
		
		JNative jn = Beep.getBeepJNative();
		int baseFrequency = 262;
		for(int j=0;j<yinLv.length;j++){
			Beep.beep(jn, (int) (baseFrequency * sortedPingJunLvArray[yinLv[j] -1]), 1000);
			System.out.print(j+1 + ":");
			System.out.print(sortedPingJunLvArray[yinLv[j] -1] + "~");
			System.out.println(baseFrequency * sortedPingJunLvArray[yinLv[j] -1]);
		}
		System.out.println("----------------------------------------------------------");
		for(int j=0;j<yinLv.length;j++){
			Beep.beep(jn, (int) (baseFrequency * sortedWuLvArray[yinLv[j] -1]), 1000);
			System.out.print(j+1 + ":");
			System.out.print(sortedWuLvArray[yinLv[j] -1] + "~");
			System.out.println(baseFrequency * sortedWuLvArray[yinLv[j] -1]);
		}
	}
}
