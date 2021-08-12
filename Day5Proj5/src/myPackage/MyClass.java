package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any number: ");
		n=obj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
obj.next();
	}

}
