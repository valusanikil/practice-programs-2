package java_programming_for_beginners;

public class FanRunner {
	public static void main(String[] args) {
		
		Fan fan=new Fan("Manufacturer 1",0.3456,"Green");
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
