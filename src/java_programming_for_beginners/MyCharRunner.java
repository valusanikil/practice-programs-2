package java_programming_for_beginners;

public class MyCharRunner {
	
	public static void main(String[] args) {
		
		MyChar myChar=new MyChar('c');
		
		System.out.println(myChar.isVowel());

		System.out.println(myChar.isConsonant());
		
		System.out.println(myChar.isNumber());
		
		System.out.println(myChar.isAlphabet());
		
		MyChar.printLowerCaseAlphabets();
		
		MyChar.printUpperCaseAlphabets();
		
	}

}
