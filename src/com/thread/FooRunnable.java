package com.thread;

public class FooRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<6;i++){
			System.out.println("Runnable Running");
		}
		System.out.println("Run By : "+Thread.currentThread().getName());
	}
}
