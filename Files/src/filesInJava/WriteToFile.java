package filesInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("D:\\document.txt");
			
			file.write("Welcome to wipro");
			file.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e) {
			System.out.println("An Error occured");
			e.printStackTrace();
		}
	}
	

}
