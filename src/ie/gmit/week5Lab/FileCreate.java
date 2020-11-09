package ie.gmit.week5Lab;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCreate {
	
	public static void main(String[] args) {
		try {
		FileReader file = new FileReader("C:\\test\\a.txt");
	}catch (FileNotFoundException e) {
		//todo Auto-generated catch block
		e.printStackTrace();
	}
	}//end main

}//end class
