package myPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MyClass {

	public static void main(String[] args) {
		/*
		 * PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		 *  pq.add(23);
		 * pq.add(13);
		 *  pq.add(45); 
		 *  pq.add(34);
		 * 
		 * System.out.println(pq.peek()); System.out.
		 *println(pq.poll());
		 */
//		ArrayList<Integer> data=new ArrayList<Integer>();
		HashSet<Integer> data=new HashSet<>();
		data.add(34);
		data.add(23);
		data.add(45);
		data.add(67);
		data.add(34);
		System.out.println(data.size());
		for(var d:data)
		{
			System.out.println(d);
		}
	}
}
