import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int N = sc.nextInt();
		int W = sc.nextInt();
		int L = sc.nextInt();
		
		double diagonal = Math.sqrt(Math.pow((double)L, 2) + Math.pow(W, 2));
		
		for (int i = 1; i <= N; i++) {
			int test = sc.nextInt();
			if(test <= diagonal) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
			
		}
	}

}
