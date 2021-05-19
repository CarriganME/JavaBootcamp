import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		int radius;
		double diameter, circumference;
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a radius");
		radius = sc.nextInt();
		
		diameter = (double)radius * 2;
		circumference = (double)radius * 2 * Math.PI;
		
		
		
		System.out.printf("%.2f\n",diameter);
		System.out.printf("%.2f\n",circumference);
	}

}
