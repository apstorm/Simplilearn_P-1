package companyDetails;

import java.util.Scanner;

public class Employee3 {

	private String name;
	private int age;
	private static String company="MIT";
//	public static String company="MIT";
	
	public void readData() {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter name: ");
		name=obj.next();
		
		System.out.println("enter age: ");
		age=obj.nextInt();
		
		
	}
	
	public void printData() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("company: "+company);
	}

}
