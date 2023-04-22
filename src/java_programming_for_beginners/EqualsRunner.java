package java_programming_for_beginners;

import java.util.Objects;

public class EqualsRunner {
	public static void main(String[] args) {
		int n1=1;
		int n2=1;
		N n3=new N(1);
		N n4=new N(1);
		System.out.println(n1==n2);
		System.out.println(n3.equals(n4));

	}
}
class N{
	
	int n;
	public N(int n) {
		this.n=n;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(n);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		N other = (N) obj;
		return n == other.n;
	}
	
}
