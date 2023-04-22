package java_programming_for_beginners;

public class PlannetRunner {

	public static void main(String[] args) {
		
		Planet earth=new Planet(); 
		Planet mars=new Planet();
		
		earth.name="Earth";
		earth.distanceFromSun=150000000;
		earth.galaxy="Milkyway";
		
		mars.name="Mars";
		mars.distanceFromSun=209000000;
		mars.galaxy="Milkyway";
		
		System.out.printf(earth.name+ " is in the "+ earth.galaxy + " galaxy "+ 
				"and have the distance "+ earth.distanceFromSun+" kms ");
		earth.revolve();
		
		System.out.println();
		
		System.out.printf(mars.name+ " is in the "+ mars.galaxy + " galaxy "+ 
				"and have the distance "+ mars.distanceFromSun+" kms ");
		mars.revolve();
	}
}
