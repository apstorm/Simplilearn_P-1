package myPackage;

public class MyClass {

	public static void main(String[] args) 
	{
		
		//Mathematics obj-outer class
		Mathematics m=new Mathematics();
		
		//obj for algebra-inner class
//		Mathematics.Algebra al=m.new Algebra();
//		
//		Mathematics.Geometry g =m.new Geometry();
//		
//		System.out.println(g.circleArea(7));
		
//		after making all class and methods and constant static
		
		System.out.println(Mathematics.Algebra.add(23, 12));
		
		System.out.println(Mathematics.Geometry.circleArea(7));
		
		System.out.println(Mathematics.Geometry.circlePerimeter(7));
		
	}

}
