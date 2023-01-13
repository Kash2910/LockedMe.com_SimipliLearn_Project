package com.caltech.lockMeProject;

import java.io.IOException;
import java.util.Scanner;

public class FileMain {
public static void main(String[] args) throws IOException {
	System.out.println("LockedMe.com by Mohammed Kashif Siddiqui");
	System.out.println("Main Menu - choose from the option below");
	System.out.println("1.Show files in Ascending Order"+"\n"+"2.Sub Menu"+"\n"+"   1.Add new files"+"\n"+"   2.Delete existing files"+"\n"+"   3.Search files"+"\n"+"   4.Exit to main menu");
	System.out.println("3.Exit out of program");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number from the menu");
	try {
	while(true){
		//main menu
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			FileAscdOrdr fa = new FileAscdOrdr();
			fa.DisplayAscdOrdr();
		break;
		case 2:
			System.out.println("Enter sub menu option");
			int subChoice = sc.nextInt();
			switch(subChoice){
			case 1:
				FileCreate fc = new FileCreate();
				fc.Create();
				break;
			case 2:
				FileDelete fd = new FileDelete();
				fd.Delete();
				break;
		    case 3:
		    	FileSearch fs = new FileSearch();
		    	fs.Search();
		    	break;
	     	case 4:
	     		System.out.println("Exiting from sub menu");
	     		break;
	     	default:
	     		System.out.println("Invalid input please enter a number from the sub-menu");
		}
		break;

		case 3: 
			System.out.println("Exited from the menu");
			System.exit(0);
		default:
			System.out.println("Invalid input please enter a number from the menu");
		}
		}
	}catch (Exception e){
			System.out.println(e);
		}
	System.out.println("Exited the App");

}
}
