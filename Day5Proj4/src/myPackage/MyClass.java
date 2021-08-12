package myPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args) {
		
//		Pattern p=Pattern.compile("[A-Za-z]{1,3}");
//		Pattern p=Pattern.compile(".");
//		Pattern p=Pattern.compile(".{3}");
//		Pattern p=Pattern.compile("[^abc]");
//		Pattern p=Pattern.compile("[0-9]{2}");
//		Pattern p=Pattern.compile("\\d{3}");
//		Pattern p=Pattern.compile("\\S{3}");
//		Pattern p=Pattern.compile("\\D{4,5}");
		
		String data;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any data: ");
		data=obj.next();
		
//		Pattern p=Pattern.compile("\\D{4,}");
//		Matcher m=p.matcher("ABBpr");
//		Pattern p=Pattern.compile("meg[0-9]*");
		Pattern p=Pattern.compile("meg[0-9]?");
		Matcher m=p.matcher(data);
		
		if(m.matches()) 
		{
			System.out.println("valid code");
		}
		else
		{
			System.out.println("invalid code");
		}
		
		
		
	}
}
