import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AboveAverage {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\menca\\OneDrive\\Documents\\School\\Junior Year\\Semester 1\\Java Bootcamp\\Lab3\\test.txt"); 
		Scanner sc = new Scanner(file); 
		int testCases = sc.nextInt();
		int numStudents = sc.nextInt();
		double average = 0, above = 0;
		int temp, aboveAvg = 0;
		
		for(int j = testCases; j > 0; j--) {
			int[] inputs = new int[numStudents];
			
			for (int i = numStudents - 1; i >= 0; i--) {
				temp = sc.nextInt();
				average += temp;
				inputs[i] = temp;
				
			}
			
			average = average / (double)numStudents;
			//System.out.println(average);
			
			for(int k = numStudents - 1; k >=0; k--) {
				if (inputs[k] > average) {
					aboveAvg++;
					
				}
			}
			above = (aboveAvg / (double)numStudents) * 100;
			String aboveS = Double.toString(above);
			aboveS = String.format("%.3f", above);
			System.out.println(aboveS + "%");
			average = 0;
			aboveAvg = 0;
			above = 0;
			if(j>1) {
				numStudents = sc.nextInt();
			}
		
			
		}
		
	
		
	}

}
