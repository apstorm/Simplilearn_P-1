package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		int age;
		Scanner obj=new Scanner(System.in);
		
		char ch='i';
		
		do 
		{	
		System.out.println("enter ur age: ");
		age=obj.nextInt();
		
		if(age<=0 || age>100)
		{
			System.out.println("please enter valid age");
		}
		else
		{
			ch='v';
			System.out.println("valid age");
		}
		}while(ch!='v');
		
		obj.close();
	}
	
}
