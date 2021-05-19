import java.util.Random;

public class random2 {

	public static void main(String[] args) {
Random rand = new Random();
		
		
		int n = rand.nextInt(100) + 1;
		int n2 = rand.nextInt(100) + 1;
		
		if(n2 > n) {
			for(int i = n; i <= n2; i++) {
				System.out.println(i);
			}
		}
		else if(n2 < n) {
			for(int i = n2; i <= n; i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println(n);
		}
		
		

	}

}
