package com.fynn.led;

public class LedNumber {
	private char[][] numberCharArray;

	public LedNumber(char[][] numberCharArray) {
		this.numberCharArray = numberCharArray;
	}

	public String getLine(int lineNumber) {
		if (this.numberCharArray == null)
			return null;

		char lineNumberCharArray[] = this.numberCharArray[lineNumber - 1];
		
		return String.valueOf(lineNumberCharArray);
	}
}
