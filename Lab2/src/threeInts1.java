import java.util.Scanner;

public class threeInts1 {

	public static void main(String[] args) {
		
		
		int in1, in2, in3;
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter an integer: ");
		in1 = sc.nextInt();
		
		System.out.println("Enter an integer: ");
		in2 = sc.nextInt();
		
		System.out.println("Enter an integer: ");
		in3 = sc.nextInt();
		
		if(in1 < in2 && in2 < in3) {
			System.out.println("The Numbers: " + in1 + ", " +  in2 + ", and " + in3 +" were inputted in strictly increasing order");
		}
		else 
			System.out.println("The Numbers: " + in1 + ", " +  in2 + ", and " + in3 +" were not inputted in strictly increasing order");
		}
		
	}


