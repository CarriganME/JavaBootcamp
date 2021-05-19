import java.util.Scanner;

public class PizzaCrust {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		double areaTotal = Math.PI * Math.pow(R, 2);
		//double areaCrust = Math.PI * Math.pow(C, 2);
		double areaCheese = Math.PI * Math.pow(R - C, 2);
		
		double ratio = (areaCheese)/areaTotal * 100;
		
		System.out.println(ratio);
	}

}
