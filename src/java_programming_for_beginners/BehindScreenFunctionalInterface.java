package java_programming_for_beginners;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class ExecuteForEach implements Consumer<Integer>{
	public void accept(Integer number) {
		System.out.println(number);
	}
}
class EvenNumberExecution implements Predicate<Integer>{
	public boolean test(Integer number) {
		return number%2==0;
	}
}
public class BehindScreenFunctionalInterface {
	public static void main(String[] args) {
		List.of(10,21,30,40,51).stream().filter(new EvenNumberExecution())
		.forEach(new ExecuteForEach());
	}
}
