package com.common;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		
		Demo demo = new Demo(1, "Keval");
		String filename = "file.ser";
		
		//Serialize data
		try{
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(demo);
			
			oos.close();
			fos.close();
			System.out.println("Data has been Serialized");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
