package java_programming_for_beginners;

import java.util.Scanner;

public class DoWhileRunner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		do {
			if(n!=0) {
				System.out.println("cube is "+ n*n*n);
				System.out.println();
			}
			System.out.print("Enter a number:");
			n=sc.nextInt();
		} while(n>0);
		System.out.println("Thank You! Have Fun!");
	}

}
