import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers: ");
		count = sc.nextInt();
		
		int[] store = new int[count];
		
		for (int i = 0; i < count; i++){
			System.out.println("Enter number: ");
			store[i] = sc.nextInt();
		}
		
		for (int i = 0; i < count; i++){
			System.out.println(store[i]);
		}
		
		System.out.println();
		
		for (int i = count - 1; i >= 0; i--){
			System.out.println(store[i]);
		}
		
		
	}

}
