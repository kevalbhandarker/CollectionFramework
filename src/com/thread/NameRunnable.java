package com.thread;

public class NameRunnable implements Runnable{
	@Override
	public void run() {
		for(int x=1;x <= 3 ;x++){
			System.out.println("Run By : "+Thread.currentThread().getName()+"x is "+x);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
