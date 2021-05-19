import java.util.Scanner;

public class JulieShoes2 {

	public static void main(String[] args) {
		final int X = 1;
		while (X == 1){
			
		int want, actual;
		double cost;
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("How many pairs of shoes does Julie want to buy?");
		want = sc.nextInt();
	     
		System.out.println("How many pairs of shoes does Julie actually buy?");
	     actual = sc.nextInt();
	     
	     System.out.println("What is the cost of the shoes?");
	     cost = sc.nextDouble();
	     
	     if(actual > want) {
	    	double savings = cost * Math.abs(want - actual);
	    	System.out.println("Julia overspent by  $" + savings); 
	     }
	     else if(actual == want) {
	    	System.out.println("Julia spent the exact amount she wanted to");
	     }
	     else {
	    	 double savings = cost * (want - actual);
		    	System.out.println("Julia saved  $" + savings); 
	    	 
	     }
	     
		}
	}

}
