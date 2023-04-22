package java_programming_for_beginners;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5);
		int sum=functionalProgrammingSum(numbers);
		System.out.println(sum);
		normalSum(numbers);
	}
	
	public static int functionalProgrammingSum(List<Integer> numbers) {
		int sum=numbers.stream().filter((number)->number%2!=0).
				reduce(0, (number1,number2)->number1+number2);
		return sum;
	}
	
	public static void normalSum(List<Integer> numbers) {
		int sum=0;
		for(int number:numbers) {
			if(number%2!=0) {
				sum=sum+number;
			}
		}
		System.out.println(sum);
	}
}
