package companyDetails;

import java.util.Iterator;

public class MyClass2 {

	 static int factorial(int n) 
	 {
		int i,fact=1;
		
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	 }
	
	public static void main(String[] args) 
	{
		int n1=4;
//		int i,fact1=1;
		int n2=5;
//		int fact2=1;
		int n3=7;
//		int fact3=1;
		
//		for(i=1;i<=n1;i++) {
//			fact1=fact1*i;
//		}
//		
//		for(i=1;i<=n2;i++) {
//			fact2=fact2*i;
//		}
//		
//		for(i=1;i<=n3;i++) {
//			fact3=fact3*i;
//		}
		
//		System.out.println(fact1);
//		System.out.println(fact2);
//		System.out.println(fact3);
//		----------------------------------------------
		
//		System.out.println(factorial(n1));
//		System.out.println(factorial(n2));
//		System.out.println(factorial(n3));
//		---------------------------------------------
		
//		Employee3 emp=new Employee3();
//		Employee3 emp2=new Employee3();
//		emp.readData();
//		emp2.readData();
//		emp.printData();
//		emp2.printData();
//		System.out.println(Employee3.company);
//		-------------------------------------------
		
//		int n=5,r=2;
//		Math4 obj=new Math4();
//		System.out.println(obj.nCr(n, r));
//		System.out.println(obj.nPr(n, r));
//		-------------------------------------------
		
		Math5 o1=new Math5();
		Math5 o2=new Math5();
		
//		System.out.println(o1.fact(5));
//		System.out.println(o1.fact(4));
		System.out.println(Math5.fact(5));
		System.out.println(Math5.fact(4));
		
	}
}
