package java_programming_for_beginners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
	
public class UniqueCharacters {
	public static void main(String[] args) {

		List<Character> list=new ArrayList<Character>();
		list.add('A');
		list.add('Z');
		list.add('A');
		list.add('B');
		list.add('Z');
		list.add('F');
		
		System.out.println(list);
		Set<Character> treeSet= new TreeSet<Character>(list);
		System.out.println(treeSet);

	}
}
