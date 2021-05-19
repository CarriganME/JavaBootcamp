import java.util.Scanner;

public class StarArrangements {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
	    
		n = sc.nextInt();
		System.out.println(n + ":");
		
		for(int i = 2; i <= (n / 2) + 1; i++){
			for(int j = i - 1; j < i + 1; j++){
				if(check(i,j,n)==true){
					System.out.println(i + ","+ j);
		        }
		    }
		}
	}


static boolean check(int i, int j, int n) {
	int sum = 0, k = 0;
	if(i + j == n) {
		return true;
	}
	
	while(sum < n ){
		if(k % 2 == 0){
			sum += i;
		}
		else {
			sum += j;
		}
		k++;
	}
	if(sum == n) {
		return true;
	}
	else {
		return false;
	}
}
}