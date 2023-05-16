package filesInJava;

import java.io.File;
import java.io.FileNotFoundException;

public class DeleteFiles {

	public static void main(String[] args) throws FileNotFoundException {
		File myobj =new File("D:\\document.txt");

		if(myobj.delete()) {
			System.out.println("Delete File "+ myobj.getName());
		}
		else {
			System.out.println("Failed to delete the file");	

		}

	}
}


