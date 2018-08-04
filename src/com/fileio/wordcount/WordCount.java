//Count the number of words in a specified file
package com.fileio.wordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the file path");
		Scanner scanner=new Scanner(System.in);
		String path=scanner.nextLine(); //Input the file path
		
		scanner.close();
		
		BufferedReader reader =new BufferedReader(new FileReader(path));
		int wordCount=0;  //Initialize word count to zero
		
		String line;
		while((line=reader.readLine()) != null) {  //Repeat till no line found
			String[] wordList = line.split("\\s+");
			wordCount += wordList.length;
		}
		reader.close();
		System.out.println("The number of words in the file is "+wordCount); //Display the number of words
		

	}

}
