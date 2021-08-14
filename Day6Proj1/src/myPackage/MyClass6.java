package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable
{
	
	String name;
	int price;
	Product(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
}

public class MyClass6 {

	public static void main(String[] args) {
		Product p=new Product("Apple", 10000);
//		Serialization
////		step-1
//		try {
//			FileOutputStream fos=
//					new FileOutputStream("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt");
//			
////			step-2
//			ObjectOutputStream oos=
//					new ObjectOutputStream(fos);
//			
//			oos.writeObject(p);
//			
//			System.out.println("object stored in file");
//			
//			oos.close();
//			fos.close();
//			
//		} catch (FileNotFoundException e) {
//			 
//			e.printStackTrace();
//		} catch (IOException e) {
//			 
//			e.printStackTrace();
//		} 
//		
		
//		Deseiralization
		try {
//			step-1
			FileInputStream fis=
					new FileInputStream("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt");
		
//			step-2
			ObjectInputStream ois=
					new ObjectInputStream(fis);
			
			p=(Product) ois.readObject();
			
			System.out.println(p.name);
			System.out.println(p.price);
			System.out.println("data retrieved from file");
			
			ois.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
