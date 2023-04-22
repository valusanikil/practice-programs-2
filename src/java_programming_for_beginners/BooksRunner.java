package java_programming_for_beginners;

public class BooksRunner {
	public static void main(String[] args) {
		
		Books books=new Books(123,"OOP With Java","Nikil"); 
		books.addReview(new Reviews(10,"Great Book",5));
		books.addReview(new Reviews(101,"Awesome",5));
		
		System.out.println(books);
	}

}
