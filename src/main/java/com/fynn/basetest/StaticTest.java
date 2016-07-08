package com.fynn.basetest;

public class StaticTest {
	/**
	 * execute order: static -> block -> constructor
	 * 
	 * @param args
	 */

	{
		System.out.println("block 1");
	}

	public StaticTest() {
		System.out.println("constructor");
	}

	public static void main(String args[]) {
		System.out.println("main");
		new StaticTest();
	}

	static {
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}
	
	{
		System.out.println("block 2");
	}

}
