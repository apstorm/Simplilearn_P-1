package pack1;

public class MyPackage1BaseClass {
	public int a;
	private int b;
	protected int c;
	int d;
	public void myPackage1baseClassMethd()
	{
		a=4;
		b=10;
		c=11;
		d=12;
	}
}

class MyPackage1DerivedClass extends MyPackage1BaseClass{
	
	public void myPackage1DerivedClassMethod() 
	{	
		a=4;
		b=10;
		c=11;
		d=12;
	}
}

class MyPackage1OtherClass
{
	public void myPackage1OtherClassMethod() {
		MyPackage1BaseClass obj=new MyPackage1BaseClass();
		
		obj.a=23;
		obj.b=12;
		obj.c=11;
		obj.d=13;
		
	}
}
