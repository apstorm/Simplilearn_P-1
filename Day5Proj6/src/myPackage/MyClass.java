package myPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {

	static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a,b,c;
			
			
			System.out.println("enter a:");
			a=obj.nextInt();
			
			System.out.println("enter b:");
			b=obj.nextInt();
			
			c=a/b;
			System.out.println("ans:"+c);
			
//			obj.next();
//			obj.close();
			
			
		}
		catch(InputMismatchException ex)
		{
			System.out.println("please double check if you have entered number");
//			obj.next();
//			obj.next();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("cannot devide with zero");
//			obj.next();
//			obj.next();
//			obj.next();
		}
		catch (Exception e) {
			System.out.println("some error occured");
			System.out.println("please write to : admin@mycompany.com");
			obj.next();
			obj.close();
		}
		
	}

}
