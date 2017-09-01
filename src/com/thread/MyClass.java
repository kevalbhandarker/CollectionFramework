package com.thread;

public class MyClass implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Started : "+t.getName());
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Ended : "+t.getName());
	}
	
}
