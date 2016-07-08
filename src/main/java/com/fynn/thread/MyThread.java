package com.fynn.thread;

public class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
            System.out.println("This is a Thread test"+i);
        }
	}
}
