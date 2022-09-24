package com.LockedMe;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Locker {
	public static void main(String[] args) throws IOException {
		System.out.println("******** Developer Name :- Abhishek A. Ghatage *******");
		System.out.println("******** Project Name :- LockedMe.com *******");
		System.out.println("--------------------------------------");
		int option = 0;
		while(true){
		System.out.println(" OPTIONS");
		System.out.println("1. Press 1 for List the files in ascendng order.");
		System.out.println("2. Press 2 for Detailed options");
		System.out.println("3. Press 3 for In Order to close the application");

		try {
		System.out.println("Please select the option");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		}catch(Exception e) {
		System.out.println(" Plese select an integer input");
		}

		switch(option) {
		case 1 : System.out.println();
		System.out.println();
		System.out.println("List of files in ascending order");
		File filedir = new File ("D:\\LockedMe");
		if(filedir.isDirectory()) {
		List listfile=Arrays.asList(filedir.list());
		Collections.sort(listfile);
		System.out.println("--------------------------");
		System.out.println("Sorting by filename in ascending order");
		for(Object s : listfile) {
		System.out.println(s);
		}
		}

		break;
		case 2 : System.out.println("====================================");
		System.out.println("======================================");

		System.out.println(" Select any of the following option");
		System.out.println("a. Press a to Add file to the existing directory");
		System.out.println("b. Press b to Delete the file from existing directory");
		System.out.println("c. Press c to Search for the file");
		System.out.println("d. Press d in order to return to the menu");
		char c=' ';

		Scanner input = new Scanner(System.in);
		c = input.next().charAt(0);

		if(c=='a') {
		System.out.println("Adding a file");
		System.out.println("Enter the file name to be inserted");

		Scanner input1 = new Scanner(System.in);
		String newfile=input1.nextLine();
		File f1= new File("d:\\LockedMe" , newfile);
		if(f1.exists()) {
		System.out.println(f1 + "File already exist");

		}else {

		f1.createNewFile();
		System.out.println("File Created");
		}
		}else if( c=='b') {
		System.out.println("Deletig a file");
		System.out.println("Enter the file name to be deleted");
		Scanner input2 = new Scanner(System.in);
		String newfile=input2.nextLine();
		File f1 = new File("d:\\LockedMe" , newfile);

		if(f1.delete()) {
		System.out.println(f1 +"File deleted successfully");
		}else {
		System.out.println("Failed to delete the file");
		}
		}else if(c=='c') {
		System.out.println("Search for a file");
		File directory = new File("d:\\LockedMe");


		String[] flist = directory.list();
		System.out.println("Enter the file name to be searched");
		Scanner filename1 = new Scanner(System.in);
		String filename2 = filename1.next();
		int flag = 0;
		if (flist == null) {
		System.out.println("Empty directory");
		}else {
		for(int i = 0; i<flist.length; i++) {
		String filename = flist[i];
		if(filename.equalsIgnoreCase(filename2)) {
		System.out.println(filename + "Found");
		flag = 1;

		}
		}
		}

		if(flag==0) {
		System.out.println("File not found");

		}

		}else if(c=='d') {
		continue;
		}else {
		System.out.println("Please enter eithe a or b or c");
		continue;

		}

		break;
		case 3 : System.exit(1);
		break;
		default: System.out.println("Enter the valid input that is 1or 2 or 3");
		break;



		}


		}



		}


}
