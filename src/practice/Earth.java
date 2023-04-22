package practice;

import java.util.Scanner;

public class Earth {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Human human=new Human();
		human.think();
		
		Animal animal=new Animal();
		animal.kill();
		
		System.out.println();
		
		Living live=new Human();
		live.eat();
		
		Living lives=new Animal();
		lives.sleep();
		
		info(human);
		info(animal);
		
	}
	
	public static void info(Living living) {
		living.die();
	}

}
