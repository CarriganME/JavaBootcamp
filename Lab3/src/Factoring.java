import java.util.Scanner;

public class Factoring {

	public static void main(String[] args) {
		int in1;
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a positive integer: ");
		in1 = sc.nextInt();
		
		System.out.println("Factors: ");
		
		for (int i = 1; i <= in1; i++) {
			if(in1 % i == 0) {
				System.out.println(i);
			}
		}
	}

}
