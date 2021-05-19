import java.util.Scanner;

public class SchoolBusDriver {

	public static void main(String[] args) {
		int exit = 1;
		int count = 0;
		SchoolBus sb = new SchoolBus();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the school bus program.");
		System.out.println("Enter how many kids get on at the next stop (or 0 to end the program)");
		count = sc.nextInt();
		if(count == 0) {
			exit = count;
		}
		else {
		sb.add(count);
		}
		
		while (exit != 0) {
		System.out.println("Enter how many kids get on at the next stop (or 0 to end the program)");
		count = sc.nextInt();
		if(count == 0) {
			exit = count;
		}
		else {
		sb.add(count);
		}
		
	}
		
		System.out.println(sb);

}
	
}
