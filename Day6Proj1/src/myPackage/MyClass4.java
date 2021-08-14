package myPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Animal
{
	String sound();
}

class Duck implements Animal
{

	@Override
	public String sound() {
		
		return "Quack Quack";
	}
	
}

class Dog implements Animal
{

	@Override
	public String sound() {
		
		return "Bow Bow";
	}
	
}

public class MyClass4 {

	public static void main(String[] args) {
		
//		Animal a;
//		a=new Duck();
//		System.out.println(a.sound());
//		
//		a=new Dog();
//		System.out.println(a.sound());
		
		List<Integer> l=new ArrayList<Integer>();
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		Set<Integer> s=new HashSet<Integer>();
		
	}

}
