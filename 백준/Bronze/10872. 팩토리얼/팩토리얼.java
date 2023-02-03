import java.util.Scanner;

public class Main {
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n*factorial(n-1);
		} 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		System.out.println(factorial(num));
		
		in.close();
	}

}
