package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {

	public static void main(String[] args) throws IOException 
	{
		//step-1 create file object
		File f=new File("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt");

//		System.out.println("file name: "+f.getName());
//		System.out.println("path: "+f.getPath());
//		System.out.println("exists: "+f.exists());
		
		//step-2 create file reader object
		FileReader fr=new FileReader(f);
		
		int i=fr.read();
		
//		about fileReader------------
		
//		while(i!=-1)
//		{
////			System.out.print((char)i);
//			System.out.print(i+",");
//			i=fr.read();
//		}
		
//		for(i=1;i<=255;i++)
//		{
//			System.out.println(i+" "+(char)i);
//		}
		
		
		// about bufferedReader
		//step-3 create object for buffer reader
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		fr.close();
		
	}

}
