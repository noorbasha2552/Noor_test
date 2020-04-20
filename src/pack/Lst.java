package pack;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst =new ArrayList<Integer>();
		lst.add(23);
		lst.add(2332);
		lst.add(43);
		lst.add(32);
		lst.add(1);
		lst.add(32322);
		ListIterator<Integer> itr =lst.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
