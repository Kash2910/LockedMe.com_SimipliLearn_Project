package com.caltech.lockMeProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public void Create() throws IOException {
	//Path of the file where folder will be created	
	String fileLocation="D:\\caltech\\";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the file name to create");
	String fileName = sc.next();
	String finalLocation = fileLocation+fileName;
	
	//Creating a file
			File file = new File(finalLocation);
			boolean response = file.createNewFile();
	//Checking if file already exists
			if(response!=true) {
				System.out.println("File creation is unsuccessful");
			}
			else {
				System.out.println("File creation is successful in - "+finalLocation);
			}
			System.out.println("Enter another option!!");
	}
}
