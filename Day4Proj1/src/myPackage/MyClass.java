package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		int ans,res = 0,a,b;
		boolean isValid=true;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter first number");
		a=obj.nextInt();
		
		System.out.println("enter second number");
		b=obj.nextInt();
		
		System.out.println("Calculator Menu.....");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("enter your choice: ");
		ans=obj.nextInt();
		
		switch (ans) {
		case 1: 
			res=a+b;
			break;
			
		case 2:
			res=a-b;
			break;
			
		case 3:
			res=a*b;
			break;
			
		case 4:
			res=a/b;
			break;
			
		default:
			isValid=false;
		}
		
		if(isValid)
		{
			System.out.println("result: "+res);
		}
		else
		{
			System.out.println("invalid option....");
		}
		
	}
}
