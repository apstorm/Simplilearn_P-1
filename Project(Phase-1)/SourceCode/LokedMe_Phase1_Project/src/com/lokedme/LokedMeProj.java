package com.lokedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LokedMeProj {

	static final String folderPath="F:\\EGDownloads\\Simplilearn stuffs\\live class vedeos\\P-1\\Project(Phase-1)\\(LockedMe.com)-files";
	public static void main(String[] args) 
	{
		
		System.out.println("************************************************************");
		System.out.println("\t\tCompany Lockers Pvt. Ltd.");
		System.out.println("************************************************************");
		System.out.println("**** 1. Display all files **********************************");
		System.out.println("**** 2. Add new file ***************************************");
		System.out.println("**** 3. Delete a file **************************************");
		System.out.println("**** 4. Search a file **************************************");
		System.out.println("**** Enter your choice: ************************************");
		System.out.println("************************************************************");
		
	}
	
	/**
	 * Description: this method is used for retrieving all 
	 * 				files in ascending order
	 * 
	 * Author: 		Atharv Pratap Singh
	 * 
	 * Date:		13/08/2021
	 */
	public static void getAllFiles()
	{
		List<String> fileNames=FileManaging.getAllFiles(folderPath);
		
		// Shows all files in folder but acending remains
		for(String s:fileNames)
		{
			System.out.println(s);
		}
	}
	
	/**
	 * Description: this method is used to add a new file
	 * 				along with some lines of content inside
	 * 				it
	 * 
	 * Author: 		Atharv Pratap Singh
	 * 
	 * Date:		13/08/2021
	 */
	public static void createFile()
	{
		// Add file and content code
		
		//variable declaration
		Scanner obj=new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String> content=new ArrayList<String>();
		
		//read file name from user
		System.out.println("enter file name: ");
		fileName=obj.nextLine();
		
		//read number of lines
		System.out.println("enter how many lines in file ?");
		linesCount=Integer.parseInt(obj.nextLine());
		
		//read lines from user input
		for(int i=1;i<=linesCount;i++)
		{
			System.out.println("enter line "+i+":");
			content.add(obj.nextLine());
		}
		
		
		//saving the content into the file
		boolean isSaved=FileManaging.createFile(folderPath, fileName, content);
		
		if(isSaved)
		{
			System.out.println("file data saved successfully");
		}
		else
		{
			System.out.println("some error is there. please contact system adminisstrator");
		}
		
		//closing scanner object
		obj.close();
	}
	
	/**
	 * Description: this method is used for deleting 
	 * 				the specified file in the folder
	 * 
	 * Author: 		Atharv Pratap Singh
	 * 
	 * Date:		14/08/2021
	 */
	public static void deleteFile()
	{
		// Deleting the specified file
		String fileName;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter file name to be deleted: ");
		fileName=obj.nextLine();
		
		boolean isDeleted=FileManaging.deleteFile(folderPath, fileName);
		//deleting the file
		if(isDeleted)
		{
			System.out.println("file deleted successfully");
		}
		else
		{
			System.out.println("file not there or may be some other issue...");
		}
		
	}
	
	/**
	 * Description: this method is used to search
	 * 				the specified file to know 
	 * 				whether is it present or not
	 * 				in the folder
	 * 
	 * Author: 		Atharv Pratap Singh
	 * 
	 * Date:		14/08/2021
	 */
	public static void searchFile()
	{
			// code for Searching a specified file
			String fileName;
			Scanner obj=new Scanner(System.in);
			System.out.println("enter the file to be searched: ");
			fileName=obj.nextLine();
			
			boolean isFound=FileManaging.searchFile(folderPath, fileName);
			
			if(isFound)
			{
				System.out.println("file is found, present");
			}
			else
			{
				System.out.println("file not found, absent");
			}
	}

}
