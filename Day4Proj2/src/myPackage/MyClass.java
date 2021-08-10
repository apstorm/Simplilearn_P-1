package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

// arrays
public class MyClass {
	
	public static void main(String[] args) {
//		int a=5,b=10,c=12,d=15,e=a+b+c+d;
//		System.out.println(e);
		
		/*
		 * int[] data=new int[]{1,2,3,4,5};
		 * 
		 * for(int i=0;i<5;i++) { System.out.println(data[i]); }
		 * System.out.println("--------------------");
		 * 
		 * for(int i=0;i<data.length;i++) { System.out.println(data[i]); }
		 * System.out.println("------------------------------"); for(int d:data) {
		 * System.out.println(d); }
		 */
		
		/*
		 * String[] names=new String[] {"infosys","cognizant","accenture"};
		 * 
		 * for(String s:names) { System.out.println(s); }
		 * 
		 * System.out.println("----------------------"); for(var d:names) {
		 * System.out.println(d); }
		 */
	
		/*
		 * // write a program in java to declare an array // and read 5 numbers from
		 * user and print // sum and average
		 * 
		 * // daeclare an array int mx=5; int[] data=new int[mx]; int sum=0, average;
		 * 
		 * Scanner obj=new Scanner(System.in);
		 * 
		 * // read numbers from user for(int i=0;i<mx;i++) {
		 * System.out.println("enter any number:"); data[i]=obj.nextInt(); }
		 * 
		 * for(var d:data) { sum=sum+d; }
		 * 
		 * average=sum/mx;
		 * 
		 * System.out.println("sum: "+sum); System.out.println("average: "+average);
		 */
	
		/*
		 * // Wrapper class System.out.println(Short.SIZE);
		 * System.out.println(Short.BYTES); System.out.println(Short.MAX_VALUE);
		 */
		
		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(23);
		data.add(34);
		data.add(12);
		data.add(45);
		
//		System.out.println(data);
		int sum=0;
		for(var d:data)
		{
			sum=sum+d;
		}
		System.out.println("sum: "+sum);
		
	}
	
}
