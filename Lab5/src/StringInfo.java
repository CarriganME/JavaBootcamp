import java.util.Scanner;

public class StringInfo {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a string");
		input = sc.next();
		
		System.out.println(input);
		System.out.println(input.length());
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(input.length()-1));
		System.out.println(input.toUpperCase());
		input = input.replace("e", "3");
		input = input.replace("E", "3");
		System.out.println(input);
	}

}
