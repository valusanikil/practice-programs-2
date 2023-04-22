package practice;

public class SolutionClass {

	public static void main(String[] args) {
		int result = RelativeSpeed(1,50,2,60,3);
		System.out.println(result);
	}

	static int RelativeSpeed(int direction,int distance1,int time1,int distance2,int time2) {
		int speed1=distance1/time1;
		int speed2=distance2/time2;
		if(direction==0) {
			return speed1+speed2;
		}
		else {
			return speed1-speed2;
		}
	}

}
