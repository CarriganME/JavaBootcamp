
public class Lab1 {

	public static void main(String[] args) {
//		int length = 15, width = 6, perimeter; 
//		perimeter = 2* length + 2 * width;
//		int area = length * width;
//		System.out.println("perimeter = " + perimeter);
//		System.out.println("area = " + area);
		
//		int shoes = 28, number = 15, cost;
//		cost = shoes * number;
//		System.out.println(cost);
		
		int years = 4;
		int dogYears = 7* years;
		System.out.println("Lucky is " + dogYears + " years old");
		
		int cost = 28, want = 15, actual = 3;
		int savings = cost*(want-actual);
		System.out.println("Julia saved  $" + savings);
		
		
		int hours = 14, minutes = 5, seconds = 7;
		seconds = 3600*hours + 60*minutes+seconds;
		System.out.println(seconds + " seconds have passed since midnight");
		
		int totalPages = 393, pages, lPages;
		pages = totalPages/7;
		lPages = pages + totalPages%7;
		System.out.println("Tom needs to read " + pages + " a day and " + lPages + " pages on the last day");
		
		int time = 30345, hours1, minutes1, seconds1, remainder;
		hours1 = time / 3600; remainder = time % 3600;
		minutes1 = remainder / 60;
		seconds1 = remainder % 60;
		System.out.println("The time is " + hours1 + ":" + minutes1 + ":" + seconds1);
		
		int cost1 = 12, change, twenties, tens, fives, ones, remainder1;
		change = 100 - cost1;
		twenties = change / 20; remainder1 = change % 20;
		tens = remainder1 / 10; remainder1 = remainder1 % 10;
		fives = remainder1 / 5; remainder1 = remainder1 % 5;
		ones = remainder1;
		System.out.println("Lindsey receives " + twenties +" twenties, " + tens + " tens, " + fives + " fives, and " + ones + " ones.");
		
		
	
	
	}

}
