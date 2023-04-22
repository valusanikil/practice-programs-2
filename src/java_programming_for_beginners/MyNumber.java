package java_programming_for_beginners;

public class MyNumber {
	
	private int n;
	private int count=0;

	public MyNumber(int n) {
		this.n=n;
	}
	
	public void isPrime() {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(true);
		}
		System.out.println(false);
	}
	
	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	public int sumOfDivisors() {
		int sum=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public void printANumberTraingle() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
