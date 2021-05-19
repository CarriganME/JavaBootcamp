import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		int in1;
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a positive integer: ");
		in1 = sc.nextInt();
		
		System.out.println("Integers: ");
		
		
			for(int i = 2; i <= in1; i+=2) {
				System.out.println(i);
			}
		
	}

}
