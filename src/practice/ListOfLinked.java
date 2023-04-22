package practice;

import java.util.Collections;
import java.util.LinkedList;

public class ListOfLinked {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		ll.add(5);
		Collections.sort(ll);
		for(int values:ll) {
			System.out.print(values+" ");
		}

	}

}
