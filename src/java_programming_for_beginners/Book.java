package java_programming_for_beginners;

public class Book {

	int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies=noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howmuch) {
		if(this.noOfCopies+howmuch>0) {
			this.noOfCopies = this.noOfCopies + howmuch;
		}
	}

	public void decreaseNoOfCopies(int howmuch) {
		if(this.noOfCopies-howmuch>0) {
			this.noOfCopies = this.noOfCopies - howmuch;
		}
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

}
