package myPackage;

import java.util.Arrays;
import java.util.List;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		List<Integer> data=Arrays.asList(12,14,17,24,43,45,56,59,77,78,92,94,99);
		
		int low,mid,high;
		low=0;
		high=data.size();
		mid=(low+high)/2;
		
		int search=778;
		
		while(true)
		{
//			System.out.println("mid: "+mid+",low: "+low+",high: "+high);
			if(data.get(mid)==search)
			{
				System.out.println("found at : "+mid);
				break;
			}
			
			if(data.get(mid)<search)
			{
				low=mid;
			}
			else
			{
				high=mid;
			}
			
			//take new mid now
			mid=(low+high)/2;
	
			if(mid==low || mid==high)
			{
				System.out.println("element : "+search+" not found");
				break;
			}
			
		}

	}

}
