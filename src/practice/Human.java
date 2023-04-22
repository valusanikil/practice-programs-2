package practice;

public class Human implements Living {
	
	public void think() {
		System.out.println("Human can think");
	}
	
	public void work() {
		System.out.println("Human can work");
	}
	
	@Override
	public void eat() {
		System.out.println("Human eat food");
	}

	@Override
	public void sleep() {
		System.out.println("Human can sleep");
	}

	@Override
	public void die() {
		System.out.println("Human will die one day");
	}

}
