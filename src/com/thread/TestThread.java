package com.thread;

public class TestThread {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread thread = new Thread(r);
		//thread.setName("Keval");
		thread.start();
	}
}
