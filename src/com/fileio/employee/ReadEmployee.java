package com.fileio.employee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployee {

	public static void main(String[] args) {

			FileInputStream fis;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(new File("EmployeeDetails.txt"));
				ois = new ObjectInputStream(fis);
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			Employee employee = null;
			try {
				while(ois.available()==0) {
				employee = (Employee) ois.readObject();  //Read each object from the file
				System.out.println(employee); //Display the object
				}
			} catch (EOFException e) {
				System.out.println("End of file");
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			} 
	}
}