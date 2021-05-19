import java.math.BigInteger;
import java.util.Scanner;

public class AnagramCounting {

	public static BigInteger factorial(int N) { 
         
        BigInteger integ = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= N; i++) 
            integ = integ.multiply(BigInteger.valueOf(i)); 
  
        return integ; 
    } 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String input = sc.next();
			System.out.println(factorial(input.length())); 
			
		}
		
		
		
	}

}
