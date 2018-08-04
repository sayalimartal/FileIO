//Count the number of lines in a specified file
package com.fileio.linecount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the file path");
		Scanner scanner=new Scanner(System.in);
		String path=scanner.nextLine(); //Input the file path
		
		scanner.close();
		
		BufferedReader reader =new BufferedReader(new FileReader(path));
		int lineCount=0;  //Initialize line count to zero
		
		while(reader.readLine() != null) //Repeat till no line found
			lineCount++;
		reader.close();
		System.out.println("The number of lines in the file is "+lineCount); //Display the number of lines

	}

}