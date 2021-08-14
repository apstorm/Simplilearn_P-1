package myPackage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		
		try
		{
//			file class method to read data
			var allLines=
			Files.readAllLines(Paths.get("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt"));
			
//			for(var a:allLines)
//			{
//				System.out.println(a);
//			}
			
			
		}
		catch(Exception ex)
		{
			
		}

	}

}
