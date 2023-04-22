package java_programming_for_beginners;

public class SwitchExercisesRunner {

	public static void main(String[] args) {

		System.out.println(isWeekDay(5));
		System.out.println(determineNameOfMonth(5));;
		System.out.println(determineNameOfDay(5));;
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return true;
		case 1:
			return false;
		case 2:
			return false;
		case 3:
			return false;
		case 4:
			return false;
		case 5:
			return false;
		case 6:
			return true;
		default:
			return false;

		}

	}
	public static String determineNameOfMonth(int monthNumber) {
		switch(monthNumber){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid Option";
		}
		
	}
	
	public static String determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Invalid option";
		}
		
	}
}
