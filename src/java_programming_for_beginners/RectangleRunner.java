package java_programming_for_beginners;

public class RectangleRunner {
	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle(12,23);
		System.out.println(rectangle);
		rectangle.setLength(10);
		rectangle.setWidth(20);
		System.out.println(rectangle);
	}
}
