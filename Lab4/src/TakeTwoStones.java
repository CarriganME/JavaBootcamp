import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
	    
		N = sc.nextInt();
		if(N % 2 == 0){
		    System.out.println("Bob");
		}
		else{
		    System.out.println("Alice");
		}
	}
}