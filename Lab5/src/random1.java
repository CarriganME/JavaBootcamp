import java.util.Random;

public class random1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int n = rand.nextInt(100) + 1;
		int n2 = rand.nextInt(100) + 1;
		
		if(n2 > n) {
			System.out.println(n2 + " is greater than " + n);
		}
		else if(n  > n2) {
			System.out.println(n2 + " is less than " + n);
		}
		else {
			System.out.println(n2 + " is equal to " + n );
		}
	}


	
	

}
