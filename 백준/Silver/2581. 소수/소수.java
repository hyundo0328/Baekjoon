import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int min = 10001;
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i=n;i<=m;i++) {
			int flag = 0;
			
			if(i == 1) {
				continue;
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				sum += i;
				if(i<min) {
					min = i;
				}
			}
		}
		
		if(min == 10001) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		in.close();
	}

}