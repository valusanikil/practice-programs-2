package java_programming_for_beginners;

public class WhileNumberPlayer {
	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit=limit;
	}

	public void printSquareUptoLimit() {
		int i=1;
		while(i*i<limit) {
			System.out.print(i*i+" ");
			i++;
		}
	}
	
	public void printCubesUptoLimit() {
		int i=1;
		while(i*i*i<limit) {
			System.out.print(i*i*i+" ");
			i++;
		}
	}
	
	
}
