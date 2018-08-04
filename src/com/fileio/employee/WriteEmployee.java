package com.fileio.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployee {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 
		
		try {
			fos = new FileOutputStream("EmployeeDetails.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Employee("Sayali",153,50_000)); //Writing employee objects to the file
			oos.writeObject(new Employee("Siddhi",22,60_000));
			oos.writeObject(new Employee("Siddhesh",39,40_000));
			oos.writeObject(new Employee("Shriya",202,80_000));
			
			oos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}