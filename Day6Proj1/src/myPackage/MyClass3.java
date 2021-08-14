package myPackage;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MyClass3 {

	public static void main(String[] args) {
		
		try 
		{
//			Variable declaration
			var allLines=Files.
			readAllLines(
			Paths.get("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt"));
		
			boolean isFound=false;
			Scanner obj=new Scanner(System.in);
			String name;
			int score = 0 ;
			ArrayList<Integer> studentScores=new ArrayList<Integer>();
			
			
//			read data from user
			System.out.println("enter name of student:");
			name=obj.next();
			
//			logic
			for(var a:allLines)
			{
				var data=a.split(",");
				if(data[0].equals(name))
				{
//					score=Integer.valueOf(data[1]);
//					isFound=true;
//					break;
					
					studentScores.add(Integer.parseInt(data[1]));
					isFound=true;
					
				}
			}
//			print output
			if(isFound)
			{
				for(int i:studentScores)
				{
				System.out.println("Student score: "+i);
				}
			}
			else
			{
				System.out.println("student absent");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
