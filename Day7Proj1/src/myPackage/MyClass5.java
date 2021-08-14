package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass5 {

	public static void main(String[] args) 
	{
		List<Integer> data=Arrays.asList(12,32,4,3,5,4,7);
		Collections.sort(data);
		
		for(var i:data)
		{
			System.out.print(i+" ");
		}
		
	}

}
