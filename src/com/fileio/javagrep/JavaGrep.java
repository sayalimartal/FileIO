//Display line numbers and lines in which a specified string occurs
package com.fileio.javagrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaGrep {

	public static void main(String[] args) throws IOException {
		
		int lineCount=0,flag=0; //Initialize line count to zero
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the file path and the string to be searched");
		String path=scanner.nextLine(); //Input the file path from command line
		
		System.out.println("Enter the string to be searched");
		String string=scanner.nextLine(); //Input the string to search
		
		scanner.close();
		
		File file=new File(path);
		
		BufferedReader b=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=b.readLine()) != null) {
			lineCount++;  //Track line count
			if(line.contains(string)) {  //Check each line for specified string
				flag=1;
				System.out.println("Line number: "+lineCount+" Line: "+line);
			}
		}
		
		b.close();
		
		if(flag==0)
			System.out.println("String "+string+" not found");  //Display if string not found in the file
	}
}
