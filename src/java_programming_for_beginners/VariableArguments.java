package java_programming_for_beginners;

public class VariableArguments {
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
		
	}
	public static int sum(int... numbers) {
		int sum=0;
		for(int number:numbers) {	
			sum=sum+number;
		}
		return sum;
	}
}
