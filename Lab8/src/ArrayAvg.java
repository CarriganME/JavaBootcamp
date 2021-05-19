import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int count = 0;
		int greater = 0, less = 0, equal = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers: ");
		count = sc.nextInt();
		
		int[] store = new int[count];
		
		for (int i = 0; i < count; i++){
			System.out.println("Enter number: ");
			store[i] = sc.nextInt();
			avg += store[i];
		}
		

		
		avg = avg / count;
		
		for (int i = 0; i < count; i ++){
			if(store[i] > avg) {
				greater++;
			}
			else if(store[i] < avg) {
				less++;
			}
			else {
				equal++;
			}
			
		}
		
		
		System.out.println("The average is " + avg + ".");
		System.out.println("Count less than average: " + less);
		System.out.println("Count equal to average: " + equal);
		System.out.println("Count greater than average: " + greater);

		
		
	}

}
