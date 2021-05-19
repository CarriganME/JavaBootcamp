import java.util.Scanner;

public class TimeCalc1 {

	public static void main(String[] args) {
		
		int inputSeconds;
		int hours, minutes, seconds, remainder;
		
		System.out.println("Enter a number of seconds: ");
	
		Scanner sc = new Scanner(System.in);
		inputSeconds = sc.nextInt();
		
		hours = inputSeconds / 3600;
		remainder = inputSeconds % 3600;
		
		minutes = remainder / 60;
		seconds = remainder % 60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds have passed");
	}

}
