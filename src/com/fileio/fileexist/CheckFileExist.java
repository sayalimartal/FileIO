//Display whether file exists in the path specified by user
package com.fileio.fileexist;

import java.io.File;
import java.util.Scanner;

public class CheckFileExist {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the file path");
		String path=scanner.nextLine(); //Input file path
		
		scanner.close();
		
		File file=new File(path); //Create a file object using specified path
		
		if(file.exists() && file.isFile())  //Check and display if file exists
			System.out.println("File exists");
		else
			System.out.println("File does not exist");

	}
}