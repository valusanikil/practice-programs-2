package java_programming_for_beginners;

import java.math.BigDecimal;

public class SimpleInterestRunner {
	
	public static void main(String[] args) {
		
		SimpleInterestCalculator calculator=new SimpleInterestCalculator("4500.00","7.5");
		
		BigDecimal totalValue=calculator.calculateTotalValue(5);
		
		System.out.println(totalValue);
		
	}
}
