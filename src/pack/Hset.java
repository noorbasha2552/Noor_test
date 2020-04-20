package pack;

import java.util.HashSet;
import java.util.Iterator;

public class Hset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		name.add("sub");
		name.add("koyal");
		name.add("noor");
		name.add("ram");
		
		Iterator<String> it =name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
