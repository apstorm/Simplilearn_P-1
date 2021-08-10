package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
//		Employee emp=new Employee("ramiro",156789,27);
		Employee emp=new Employee(350000);
//		emp.readData();
		emp.readNameAndAge();
		emp.printData();

	}

}

class Employee
{
	public String name;
	public int salary;
	public int age;
	
	Employee()
	{
		this.name=null;
		this.salary=0;
		this.age=0;
	}
	
	Employee(String name, int salary, int age) {
//		name="deepak";
//		salary=95000;
//		age=24;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	Employee(int salary)
	{
		this.salary=salary;
	}
	
	public void readData()
	{
		Scanner obj=new Scanner(System.in);
//		System.out.println("enter name: ");
//		name=obj.next();
		System.out.println("enter salary: ");
		salary=obj.nextInt();
		System.out.println("enter age: ");
		age=obj.nextInt();
		
		obj.close();
	}
	
	public void readNameAndAge()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter name: ");
		name=obj.next();
		System.out.println("enter age: ");
		age=obj.nextInt();
		
		obj.close();
	}
	
	public void printData()
	{
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("age: "+age);
	}
	
}