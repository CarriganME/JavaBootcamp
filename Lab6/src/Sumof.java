import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a positive integer: ");
		int high = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= high; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
