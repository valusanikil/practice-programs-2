package java_programming_for_beginners;

public class MyNumberRunner {

	public static void main(String[] args) {
		
		MyNumber number=new MyNumber(9);
		
		number.isPrime();
		System.out.println();
		
		int sum=number.sumUptoN();
		System.out.println(sum);
		System.out.println();
		
		int sumOfDivisors=number.sumOfDivisors();
		System.out.println(sumOfDivisors);
		System.out.println();
		
		number.printANumberTraingle();
		
	}
}
