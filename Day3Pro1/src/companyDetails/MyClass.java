package companyDetails;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		String name;
		float height;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your name: ");
//		name=obj.next();
		name=obj.nextLine();
		
		int age;
		System.out.println("enter ur age: ");
		age=obj.nextInt();
		
		System.out.println("enter ur height ");
		height=obj.nextFloat();
		
		System.out.println("ur name is "+name);
		System.out.println("ur age is "+age);
		System.out.println("ur height is "+height);
		
	}

}
