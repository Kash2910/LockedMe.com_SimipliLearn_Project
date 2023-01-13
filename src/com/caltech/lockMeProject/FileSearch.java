package com.caltech.lockMeProject;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	public void Search() {
		String fileLocation = "D:\\caltech\\";
		Scanner sc = new Scanner(System.in);
		File file = new File(fileLocation);
		//display operation
		File fileName[] = file.listFiles();
		if(fileName.length == 0){
			System.out.println("Folder is empty nothing to search");
		}
		else {
		System.out.println("Enter the filename to search");
		String SearchFile=sc.next();
		int flag=0;
		// Using for each loop to iterate through array
		for(File key:fileName) {
			if(key.getName().equals(SearchFile)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("Filename: "+SearchFile+" is found");
		}
		else {
			System.out.println("File is not found");
		}
	}
		System.out.println("Enter another option!!");
		}
	}
