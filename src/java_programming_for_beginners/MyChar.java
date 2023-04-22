package java_programming_for_beginners;

public class MyChar {
	
	private char ch;
	
	MyChar(char ch){
		this.ch=ch;
	}

	public boolean isVowel() {
		if(this.ch=='a'||this.ch=='e'||this.ch=='i'||this.ch=='o'||this.ch=='u'
				||this.ch=='A'||this.ch=='E'||this.ch=='I'||this.ch=='O'||this.ch=='U') {
			return true;
		}
		return false;
	}
	
	public boolean isConsonant() {
		if(this.ch=='a'||this.ch=='e'||this.ch=='i'||this.ch=='o'||this.ch=='u'
				||this.ch=='A'||this.ch=='E'||this.ch=='I'||this.ch=='O'||this.ch=='U') {
			return false;
		}
		return true;
	}

	public boolean isNumber() {
		if(this.ch>=48 && this.ch<=57) {
			return true;
		}
		return false;
	}
	
	public boolean isAlphabet() {
		if(this.ch>='a'&&this.ch<='z' ||this.ch>='A'&&this.ch<='Z') {
			return true;
		}
		return false;
	}
	
	public static void printLowerCaseAlphabets() {
		for(char i='a';i<='z';i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void printUpperCaseAlphabets() {
		for(char i=65;i<=90;i++) {
			System.out.print(i);
		}
	}

}
