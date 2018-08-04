//Write objects of MyClass added to an ArrayList to a file and read from it
package com.fileio.myclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyClassTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		ArrayList<MyClass> myClass = new ArrayList<>();

		myClass.add(new MyClass("Sayali",29));//Add objects of MyClass to ArrayList
		myClass.add(new MyClass("Siddhi",4));
		myClass.add(new MyClass("Ajay",10));
		myClass.add(new MyClass("Leela",15));
		myClass.add(new MyClass("Ramesh",20));

		writeToFile(myClass,"MyClass.txt"); //Write to the file
		readFromFile("MyClass.txt");        //Read from the file
	}
	
	private static void writeToFile(ArrayList<MyClass> myClass,String fileName) throws IOException {
 
		//Create file output stream and object output stream objects
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(myClass);  //Write the ArrayList to the file

		oos.close();
		fos.close();
	}
	
	private static void readFromFile(String fileName) throws ClassNotFoundException, IOException {
		
			
			//Create file input stream and object input stream objects
			FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			//read the array listfrom the file
			ArrayList<MyClass> myClass=(ArrayList<MyClass>) ois.readObject();
			
			myClass.stream().forEach((myclass)->System.out.println(myclass));
		
	}

	
}
