package com.caltech.lockMeProject;
import java.io.File;

public class FileAscdOrdr {
	public void DisplayAscdOrdr() {
		String fileLocation="D:\\caltech\\";
		File file = new File(fileLocation);
		//Display operation
		File fileName[]=file.listFiles();
		//Checking if directory is empty
		if(fileName.length == 0){
			System.out.println("Folder is empty please create a file");
		}
		else {
			System.out.println("Diaplying files in asscending order in the "+ fileLocation);	
		for(File key:fileName) {			
			System.out.println(key.getName());
			}
		}
		System.out.println("Enter another option!!");
	}
}
