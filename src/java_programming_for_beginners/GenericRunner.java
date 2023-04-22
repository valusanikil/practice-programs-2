package java_programming_for_beginners;

public class GenericRunner {

	public static void main(String[] args) {
		MyCustomList<String> list=new MyCustomList<String>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value=list.get(0);
		System.out.println(list);
		System.out.println(value);
		
		System.out.println();
		
		MyCustomList<Integer> list2=new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(2));
		Integer number=list2.get(0);
		System.out.println(list2);
		System.out.println(number);
	}

}
