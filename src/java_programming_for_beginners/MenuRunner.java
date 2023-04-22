package java_programming_for_beginners;

import java.util.Scanner;

public class MenuRunner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1:");
		int number1=sc.nextInt();
		System.out.println("Enter Number2:");
		int number2=sc.nextInt();
		
		System.out.println("Choices available are:");
		System.out.println("1-Add");
		System.out.println("2-Substract");
		System.out.println("3-Divide");
		System.out.println("4-Multiply");
		
		System.out.println("Choose Operation:");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println(number1+number2);
		}
		else if(choice==2) {
			System.out.println(number1-number2);
		}
		else if(choice==3) {
			System.out.println(number1*number2);
		}
		else if(choice==4){
			System.out.println(number1/number2);
		}
		else {
			System.out.println("Invalid choice");
		}
	}
	
}
