package myPackage;

import java.io.FileWriter;
import java.io.IOException;

public class MyClass5 {

	public static void main(String[] args) {
//		writing content into file
			try {
				FileWriter fw = new FileWriter
						("F:\\EGDownloads\\Simplilearn stuffs\\hello.txt",true);
				fw.write("\nMeganadh");
				fw.close();
				System.out.println("file writting done");
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		
		
	}

}
