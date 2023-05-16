package filesInJava;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {

	public static void main(String[] args) {
		try {
			File file = new File("Downloads");
			if(file.createNewFile()) {
				System.out.println("File Created "+file.getName());
				System.out.println("Absolute path of file "+file.getAbsolutePath());
				
			}
			else {
				System.out.println("File already Exist");
			}
		}
		catch(IOException e) {
			System.out.println("An Error occured");
			e.printStackTrace();
		}

	}

}
