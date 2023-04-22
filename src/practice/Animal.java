package practice;

public class Animal implements Living {
	
	public void kill() {
		System.out.println("Animals kill each other");
	}
	
	public void pet() {
		System.out.println("Animals can be as pets to human");
	}

	@Override
	public void eat() {
		System.out.println("Animals eat food");
	}

	@Override
	public void sleep() {
		System.out.println("Animals can sleep");
	}

	@Override
	public void die() {
		System.out.println("Animals will die one day");
	}
}
