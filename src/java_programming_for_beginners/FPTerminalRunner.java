package java_programming_for_beginners;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPTerminalRunner {
	public static void main(String[] args) {
		List.of(23,12,34,53).stream().filter(
				(element)->element%2==0).
		collect(Collectors.toList()).
		forEach(
				(element)->System.out.print(element+" ")
				);
		
		System.out.println();
		
		IntStream.range(1,11).map(
				(element)->element*element).boxed().
		collect(Collectors.toList()).
		forEach(
				(e->System.out.print(e+" "))
				);
	}
}
