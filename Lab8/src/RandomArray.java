import java.util.Random;

public class RandomArray {

	public final static int COUNT = 1000000;
	
	public static void main(String[] args) {
		int[] countIn = new int[10];
		Random rand = new Random();
		
		for (int i = 0; i < COUNT; i++) {
		
			int n = rand.nextInt(9) + 1;
			
	//		System.out.print(n + "  ");
			
			switch(n) {
			  case 1:
			    countIn[0]++;
			    break;
			  case 2:
				countIn[1]++;			    
				break;
			  case 3:
				 countIn[2]++;
				 break;
			  case 4:
				 countIn[3]++;			    
				 break;
			  case 5:
				 countIn[4]++;
				 break;
			  case 6:
				  countIn[5]++;			    
				  break;
			  case 7:
				  countIn[6]++;
				  break;
			  case 8:
				  countIn[7]++;			    
				  break; 
			  case 9:
				  countIn[8]++;			    
				  break; 

			}
			
		}
		
		System.out.println("\n\n1: " + (double) countIn[0] / COUNT * 100 + "%");
		System.out.println("2: " + (double) countIn[1] / COUNT * 100 + "%");
		System.out.println("3: " + (double) countIn[2] / COUNT  * 100 + "%");
		System.out.println("4: " + (double) countIn[3] / COUNT  * 100 + "%");
		System.out.println("5: " + (double) countIn[4] / COUNT  * 100 + "%");
		System.out.println("6: " + (double) countIn[5] / COUNT  * 100 + "%");
		System.out.println("7: " + (double) countIn[6] / COUNT  * 100 + "%");
		System.out.println("8: " + (double) countIn[7] / COUNT  * 100 + "%");
		System.out.println("9: " + (double) countIn[8] / COUNT  * 100 + "%");
		
		
		
		

	}

}
