package com.lokedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManaging 
{
/**
 * this method will return the file names from folder 
 * @param folderPath
 * @return list<String>
 */
	public static List<String> getAllFiles(String folderPath)
	{
		//file object creation
		File fl=new File(folderPath);
		
		//getting all files inside array of file
		File[] listOfFiles=fl.listFiles();
		
		//declare list to store file names
		List<String> fileNames=new ArrayList<String>();
		
		for(File f:listOfFiles)
		{
			fileNames.add(f.getName());
		}
		
		//return list
		return fileNames;
		
	}
	/**
	 * this method create or append content into the specified file
	 * @param folderPath
	 * @param fileName
	 * @param content
	 * @return
	 */
	public static boolean createFile(String folderPath,String fileName, List<String> content)
	{
		try
		{
			File fl=new File(folderPath, fileName);
			FileWriter fw=new FileWriter(fl);
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
	/**
	 * this method will delete the file name specified
	 * @param folderPath
	 * @param fileName
	 * @return
	 */
	public static boolean deleteFile(String folderPath,String fileName)
	{
		//adding folder path with filename and create file object
		File f=new File(folderPath+"\\"+fileName);
		try
		{
			if(f.delete())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public static boolean searchFile(String folderPath,String fileName)
	{
		//adding folder path with filename and create file object
		File f=new File(folderPath+"\\"+fileName);
		try
		{
			if(f.exists())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e)
		{
			return false;
		} 

	}
}
