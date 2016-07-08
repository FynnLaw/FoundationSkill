package com.fynn.led;

public class Num2Led {
	public static String num2Led(int number) throws Exception {

		String numberString = Integer.toString(number);
		char[] numberArray = numberString.toCharArray();

		String line1 = "";
		String line2 = "";
		String line3 = "";
		for (int i = 0; i < numberArray.length; i++) {
			LedNumber ledNumber = LedNumbersConst.getLedNumber(Integer.valueOf(String.valueOf(numberArray[i])));
			line1 += ledNumber.getLine(1);
			line2 += ledNumber.getLine(2);
			line3 += ledNumber.getLine(3);

		}
		return line1 + "\n" + line2 + "\n" + line3;
	}
}
