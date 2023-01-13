package com.caltech.lockMeProject;
import java.io.File;
import java.util.Scanner;

public class FileDelete {
		public void Delete() {
		String fileLocation="D:\\caltech\\";
		Scanner sc = new Scanner(System.in);
		File file1 = new File(fileLocation);
		File fileList[] = file1.listFiles();
		//Checking if directory is empty
		if(fileList.length == 0){
			System.out.println("Folder is empty nothing to delete");
		}else {
		System.out.println("Enter the file name to delete");
		String fileName = sc.next();
		String finalLocation = fileLocation+fileName;
		System.out.println(finalLocation);
		File file = new File(finalLocation);
		int found = 0;
		//Delete operation
		for(File key:fileList) {
			if(key.getName().equals(fileName)) {
				found = 1;
				break;
			}else {
				found = 0;			
			}			
	    	}
		if(found==1) {
			file.delete();
			System.out.println("File deleted successfully!!");
		}
		else {
			System.out.println("File not found");	
		}
		}		
		System.out.println("Enter another option!!");
	}
}
