package com.fynn.led;

public class LedNumbersConst {
	 public static char[][] zero = {
			 {' ','_',' '},
			 {'|',' ','|'},
			 {'|','_','|'}
	 };
	 
	 public static char[][] one = {
			 {' ',' ',' '},
			 {' ',' ','|'},
			 {' ',' ','|'}
	 };
	 
	 public static char[][] two = {
			 {' ','_',' '},
			 {' ','_','|'},
			 {'|','_',' '}
	 };
	 
	 public static char[][] three = {
			 {' ','_',' '},
			 {' ','_','|'},
			 {' ','_','|'}
	 };
	 
	 public static char[][] four = {
			 {' ',' ',' '},
			 {'|','_','|'},
			 {' ',' ','|'}
	 };
	 
	 public static char[][] five = {
			 {' ','_',' '},
			 {'|','_',' '},
			 {' ','_','|'}
	 };
	 
	 public static char[][] six = {
			 {' ','_',' '},
			 {'|','_',' '},
			 {'|','_','|'}
	 };
	 
	 public static char[][] seven = {
			 {' ','_',' '},
			 {' ',' ','|'},
			 {' ',' ','|'}
	 };
	 
	 public static char[][] eight = {
			 {' ','_',' '},
			 {'|','_','|'},
			 {'|','_','|'}
	 };
	 
	 public static char[][] nine = {
			 {' ','_',' '},
			 {'|','_','|'},
			 {' ','_','|'}
	 };
	 
	public static LedNumber getLedNumber(int number) throws Exception {

		if (number < 0 || number > 9)
			throw new Exception("数值范围不正确,number:" + number);
		
		switch(number){
			case 0:
				return new LedNumber(zero);
			case 1:
				return new LedNumber(one);
			case 2:
				return new LedNumber(two);
			case 3:
				return new LedNumber(three);
			case 4:
				return new LedNumber(four);
			case 5:
				return new LedNumber(five);
			case 6:
				return new LedNumber(six);
			case 7:
				return new LedNumber(seven);
			case 8:
				return new LedNumber(eight);
			case 9:
				return new LedNumber(nine);
			default:
				return null;
		}
	}
}
