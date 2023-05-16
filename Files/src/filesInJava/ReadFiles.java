package filesInJava;                          //Program to read a file using Scanner Class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

	public static void main(String[] args)  {
		try {
			File file = new File("D:\\CaseStudy_28thApril.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("An Exception occured");
			e.printStackTrace();
		}

	}

}
