package java_programming_for_beginners;

public class StaticBlockRunner {
	public static void main(String[] args) {
		System.out.println("first line");
		
		System.out.println("second line");
	}
	static {
		System.out.println("last line");
	}
	
}
