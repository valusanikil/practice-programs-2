package java_programming_for_beginners;

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects= {new Bird(),new Aeroplane()};
		for(int i=0;i<flyingObjects.length;i++) {
			flyingObjects[i].fly();
		}
	}
}
