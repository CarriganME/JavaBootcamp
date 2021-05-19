
public class TimeTrack {
	private String name;
	private int totalSeconds, days, hours, minutes, seconds;
	
	public TimeTrack(String newName) {
		name = newName;
	}
	
	public void addSeconds(int newSeconds){
		seconds += newSeconds;
	}
	
	public void addMinutes(int newMinutes){
		minutes += newMinutes;
	}
	
	public void addHours(int newHours){
		hours += newHours;
	}
	
	public void addDays(int newDays){
		days += newDays;
	}
	
	public int getTotalSeconds() {
		totalSeconds = seconds + 60 * minutes + 3600 * hours + 86400 * days;
		
		return totalSeconds;
	}
	
	public String toString() {
		getTotalSeconds();
		days = totalSeconds / 86400;
		totalSeconds = totalSeconds % 86400;
		
		hours = totalSeconds / 3600;
		totalSeconds = totalSeconds % 3600;
		
		minutes = totalSeconds / 60;
		seconds = totalSeconds % 60;
		
		return name + ":\n" +
				"	days: " + days +
				"\n	hrs : " + hours +
				"\n	min : " + minutes +
				"\n 	sec : " + seconds;
	}
	
}
