package javacalculator;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		String n = System.getProperty("user.name");
		File f1 = new File("C:\\Users"+n+"\\Desktop\\Cayden's Utils");
		
			f1.mkdir();
		
	}

}
