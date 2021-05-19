import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\menca\\OneDrive\\Documents\\School\\Junior Year\\Semester 1\\Java Bootcamp\\Lab3\\numbers.txt"); 
		Scanner sc = new Scanner(file); 
		//int[] inputs = new int[];
		int max = 0, min = 1000000000, count = 0, temp, i = 0;
		double average, sum = 0;
			    
		while (sc.hasNextLine()) {
			temp = sc.nextInt();
			if(temp != 0) {
				count++;
				
				if(temp > max) {
					max = temp;
				}
				
				if(temp < min) {
					min = temp;
				}
				sum += temp;
				i++;
			}		
	
			}
		average = sum / i;
		System.out.println("count: " + count);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("average: " + average);
		
			
		} 
		

	}


