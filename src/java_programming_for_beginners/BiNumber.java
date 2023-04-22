package java_programming_for_beginners;

public class BiNumber {
	
	private int n1;
	private int n2;
	
	BiNumber(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public int add() {
		return this.n1+this.n2;
	}
	
	public int multiply() {
		return this.n1*this.n2;
	}
	
	public void double1() {
		int num1=this.n1+this.n1;

		int num2=this.n2+this.n2;
		System.out.println(num1+","+num2);
	}
	
	public int getNumber1() {
		int num1=this.n1+this.n1;
		return num1;
	}

	public int getNumber2() {
		int num2=this.n2+this.n2;
		return num2;
	}

}
