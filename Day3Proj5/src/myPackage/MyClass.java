package myPackage;

public class MyClass {

}

class EnglishMessage
{
	public void printHi()
	{
		System.out.println("hi");
	}
	public void printHello()
	{
		System.out.println("hello");
	}
	
	public void printGoodMorning()
	{
		System.out.println("good morning");
	}
}

class HindiMessage extends EnglishMessage
{
	
	@Override
	public void printGoodMorning()
	{
		System.out.println("subhodaya");
	}
}
