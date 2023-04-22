package practice;

public class Strings {

	public static void main(String[] args) {
		int x=50;
		int y=50;
		Integer z=new Integer(50);
		
		String s1="Nikil";
		String s2="Nikil";
		String s3=new String("Nikil");
		String s4=new String("Nikil");

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(x==y);
		System.out.println(x==z);		
	}

}
