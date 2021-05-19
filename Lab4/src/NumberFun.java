import java.util.Scanner;

public class NumberFun {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
	    
		N = sc.nextInt();
		
		for(int i = N; i > 0; i--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a + b == c || a - b == c || b - a == c || a * b == c || (double)a / b == c || (double)b / a == c) {
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
			}
		}
		
		
	}

}
