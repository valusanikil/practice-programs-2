package java_programming_for_beginners;

public class Fan {
	
	String make;
	double radius;
	String color;
	boolean isOn;
	int speed;
	
	public Fan(String make, double radius, String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	public void switchOn() {
		this.isOn=true;
		setSpeed(5);
	}
	
	public void switchOff() {
		this.isOn=false;
		setSpeed(0);
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public String toString() {
		return String.format("make:%s, radius:%f, color:%s, isOn:%b, speed:%d", make,radius,color,isOn,speed);
	}
}
