package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WrtFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =null;
		try {
			br =new BufferedReader(new FileReader("test.txt"));
			String l;
			while((l=br.readLine())!=null) {
				System.out.println(l);
			}
		}
		catch(IOException e) {
			System.out.println("print catch");
	}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}}
