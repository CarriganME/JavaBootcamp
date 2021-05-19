import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int X,Y,N;
		
		Scanner sc = new Scanner(System.in);
	    
		//System.out.println("Enter a positive integer: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(i % X == 0 && i % Y == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % X == 0 ) {
				System.out.println("Fizz");
		}
			else if(i % Y == 0 ) {
				System.out.println("Buzz");
		}
			else {
				System.out.println(i);
			}
	}

}
	
}
