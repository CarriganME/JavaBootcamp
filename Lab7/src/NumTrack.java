
public class NumTrack {
	private String name;
	private int sum = 0, count = 0;
	private double average;
	
	public NumTrack(String Name) {
		name = Name;
	}
	
	public void add(int addTo) {
		sum += addTo;
		count++;
	}
	
	public int getCount() {
		return count;
	}
	public int getSum() {
		return sum;
	}
	
	public double getAverage() {
		return (double)sum / count;
	}
	
	public String toString() {
		average = (double) sum / count;
		return "Numbers has \n a sum of " + sum + "\n a count of " + count + "\n an average of " + average;
	}
	
	
}
