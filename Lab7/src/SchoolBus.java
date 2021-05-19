
public class SchoolBus {
	private int sum = 0, count = 0;
	private double average;
	
	public SchoolBus() {
		
	}
	
	public void add(int onBus) {
		sum += onBus;
		count++;
	}
	
	public String toString() {
		average = (double) sum / count;
		return "Upon arrival at the school, the bus had " + sum + " kids on it.\n " 
				+ "An average of " + average + " got on the bus per stop.";
	}
}
