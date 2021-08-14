package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args)
	{
		
		List<Integer> data=Arrays.asList(2,3,4,5,6,7,8,19,89);
		
		List<String> names=Arrays.asList("meg","raj","kiran");
		
//		for(int i=0;i<data.size();i++)
//		{
//			System.out.println(data.get(i));
//		}
		
		int searchElement,loc=0,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter search element: ");
		searchElement=obj.nextInt();
		
//		linear search way 1
//		for(int d:data)
//		{
//			
//			if(d==searchElement) 
//			{	
//				
//				System.out.println("\nelement found at "+loc+": "+d);
//				break;
//			}
//			loc++;
//			
//		}
//		
//		if(loc==data.size())
//		{
//			System.out.println("element not found...");
//		}

//		linear search way 2
//		for(i=0;i<data.size();i++)
//		{
//			if(data.get(i)==searchElement)
//			{
//				break;
//			}
//		}
//		
//		if(i==data.size())
//		{
//			System.out.println("element not found");
//		}
//		else
//		{
//			System.out.println("element found at location : "+i);
//		}
		
	}

}
