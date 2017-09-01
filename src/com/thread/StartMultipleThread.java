package com.thread;

public class StartMultipleThread {
	public static void main(String[] args) {
		//Make one Runnable
		NameRunnable run = new NameRunnable();
		Thread one = new Thread(run);
		Thread two = new Thread(run);
		Thread three = new Thread(run);
		
		one.setName("one");
		two.setName("two");
		three.setName("three");
		one.start();
		two.start();
		three.start();
		
		
	}
}
