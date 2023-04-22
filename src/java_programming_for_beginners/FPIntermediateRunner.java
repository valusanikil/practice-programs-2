package java_programming_for_beginners;

import java.util.List;
import java.util.stream.IntStream;

public class FPIntermediateRunner {
	public static void main(String[] args) {
		
		List<String> list=List.of("Apple","Ant","Bat");
		
		IntStream.range(1, 11).map(
				(e)->e*e
				).
		forEach(
				(e)->System.out.print(e+" ")
				);
		
			System.out.println();
			
		list.stream().map(
				(element)->element.toLowerCase()).
		forEach(
				(element)->System.out.print(element+" ")
				);
		
		System.out.println();
		
		list.stream().map(
				(text)->text.length()).
		forEach(
				(number)->System.out.print(number+" ")
				);
	}
}
