package filesInJava;

import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\SO20462674\\Downloads\\TC_HollandBarret_V1.0.xlsx");
		if(file.exists()) {
			System.out.println("File Name "+ file.getName());
			System.out.println("Absolute Path "+ file.getAbsolutePath());
			System.out.println("Writable "+file.canWrite());
			System.out.println("Readable "+file.canRead());
			System.out.println("File size in bytes"+ file.length());
		}
		else {
			System.out.println("The file does not exist");
		}

	}

}
