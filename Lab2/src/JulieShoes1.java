import java.util.Scanner;

public class JulieShoes1 {

	public static void main(String[] args) {
		int want, actual;
		double cost;
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("How many pairs of shoes does Julie want to buy?");
		want = sc.nextInt();
	     
		System.out.println("How many pairs of shoes does Julie actually buy?");
	     actual = sc.nextInt();
	     
	     System.out.println("What is the cost of the shoes?");
	     cost = sc.nextDouble();
	     
		double savings = cost * (want - actual);
		System.out.println("Julia saved  $" + savings);
	}

}
