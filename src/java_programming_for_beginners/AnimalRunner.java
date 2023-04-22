package java_programming_for_beginners;

abstract class Animal{
	
	abstract void bark();
}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("Bow Bow");
	}
	
}
class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("Meow Meow");
	}
	
}

public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animals= {new Cat(),new Dog()};
		for(int i=0;i<animals.length;i++) {
			animals[i].bark();
		}
	}
}
