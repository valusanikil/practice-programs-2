package java_programming_for_beginners;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		printWithFP(list);
		System.out.println();

		printWithFPWithFilteringEven(list);
		System.out.println();

		printWithFPWithFilteringOdd(list);
	}

	private static void printWithFPWithFilteringEven(List<Integer> list) {
		list.stream().filter(number -> number % 2 == 0).
		forEach(number -> System.out.print(number + " "));
	}

	public static void printWithFPWithFilteringOdd(List<Integer> list) {
		list.stream().filter(number -> number % 2 != 0).forEach(number -> System.out.print(number + " "));
	}

	public static void printWithFP(List<Integer> list) {
		list.stream().forEach(number -> System.out.print(number + " "));
	}
}
