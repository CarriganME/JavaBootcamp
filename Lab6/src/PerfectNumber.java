import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a positive integer: ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < input; i ++) {
			if(input % i == 0) {
				sum += i;
			}
			
		}
		
		if(sum == input) {
			System.out.println(input + " is a perfect number");
		}
		else {
			System.out.println(input + " is not a perfect number");
		}
		
	}

}
