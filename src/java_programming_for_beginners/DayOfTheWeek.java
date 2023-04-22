package java_programming_for_beginners;

public class DayOfTheWeek {
	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String daysWithMostChar = "";
		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostChar.length()) {
				daysWithMostChar = day;
			}
		}
		System.out.println(daysWithMostChar);
		
		for(int i=daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
