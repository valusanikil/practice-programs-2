package practice;

class Test{
	public static void main(String[] args) {
		Base b=new Derived();
		System.out.println(b.getValue());
	}
}
class Base{
	int value=0;
	
	Base(){
		addvalue();
	}
	void addvalue() {
		value+=10;
	}
	int getValue() {
		return value;
	}
}
class Derived extends Base{
	Derived(){
		addValue();
	}
	void addValue() {
		value+=20;
	}
}