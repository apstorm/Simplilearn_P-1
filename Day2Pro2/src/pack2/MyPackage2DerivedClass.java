package pack2;

import pack1.MyPackage1BaseClass;

public class MyPackage2DerivedClass extends MyPackage1BaseClass
{

	public void myPackage2DerivedClassMethod() 
	{
		a=4;
		b=10;
		c=11;
		d=12;
	}	
}

class MyPackage2OtherClass
{
	public void myPackage2OtherClassMethod() 
	{
		MyPackage1BaseClass obj=new MyPackage1BaseClass();
		obj.a=11;
		obj.b=12;
		obj.c=23;
		obj.d=22;
		
	}
}