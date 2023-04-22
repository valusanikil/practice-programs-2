package java_programming_for_beginners;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks= {90,92,93,96,95,98};
		
		Student student=new Student("Nikil",marks);
		
		int number=student.getNumberOfMarks();
		System.out.println(number);
		
		int sum=student.getTotalMarks();
		System.out.println(sum);
		
		int maximumMark=student.getMaximumMark();
		System.out.println(maximumMark);
		
		int minimumMark=student.getMinimumMark();
		System.out.println(minimumMark);
		
 		BigDecimal average=student.getAverageMarks();
		System.out.println(average);
		
		student.addNewMark(35);
		
		student.removeMarkAtIndex(5);
		
	}
}
