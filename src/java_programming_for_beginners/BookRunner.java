package java_programming_for_beginners;

public class BookRunner {
	
	public static void main(String[] args) {
		
		Book artOfComputerprogramming=new Book(10);
		Book effectiveJava=new Book(10);
		Book cleanCode=new Book(10);
				
		artOfComputerprogramming.setNoOfCopies(100);
		
		artOfComputerprogramming.increaseNoOfCopies(20);
		
		effectiveJava.setNoOfCopies(400);
		
		effectiveJava.decreaseNoOfCopies(100);
		
		System.out.println(artOfComputerprogramming.getNoOfCopies());
		
		System.out.println(effectiveJava.getNoOfCopies());
		
	}

}
