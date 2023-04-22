package java_programming_for_beginners;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	String name;
	int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		int count = 0;
		for (int mark : marks) {
			count++;
		}
		return count;
	}

	public int getTotalMarks() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		return sum;
	}

	public int getMaximumMark() {
		int largest = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > largest) {
				largest = marks[i];
			}
		}
		return largest;
	}

	public int getMinimumMark() {
		int smallest = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < smallest) {
				smallest = marks[i];
			}
		}
		return smallest;
	}

	public BigDecimal getAverageMarks() {
		int count = 0;
		int sum = 0;
		for (int mark : marks) {
			count++;
		}
		for (int mark : marks) {
			sum = sum + mark;
		}
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(count), 3, RoundingMode.UP);
		return average;
	}

	public void addNewMark(int mark) {
		int[] newArr = new int[marks.length + 1];
		for (int i = 0; i < marks.length; i++) {
			newArr[i] = marks[i];
		}
		newArr[marks.length] = mark;
		System.out.println(Arrays.toString(newArr));
	}

	public void removeMarkAtIndex(int index) {
		for(int i=index;i<marks.length-1;i++) {
			marks[i]=marks[i+1];
		}
		System.out.print("[");
		for(int i=0;i<marks.length-1;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println("]");
	}
	
}
