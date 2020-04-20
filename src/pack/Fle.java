package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Fle {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File fl= new File("test.txt");
		if(!fl.exists()) {
			try {
				fl.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PrintWriter pw =new PrintWriter(fl);
		pw.println("hi how are u?");
		pw.println("am good how about you");
		pw.close();
		
		

	}

}
