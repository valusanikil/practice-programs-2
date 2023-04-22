package java_programming_for_beginners;

import java.util.ArrayList;

public class Books {
	
	private int id;
	private String name;
	private String author;
	private ArrayList<Reviews> reviews=new ArrayList<Reviews>();
	
	public Books(int id,String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}

	public void addReview(Reviews reviews) {
		this.reviews.add(reviews);
	}
	
	public String toString() {
		return String.format("id-%d, name-%s, author-%s, Reviews-[%s]", id,name,author,reviews);
	}
	
}
