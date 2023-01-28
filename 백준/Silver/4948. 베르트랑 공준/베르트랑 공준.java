import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int num = in.nextInt();
			int count = 0;
			
			if(num == 0) {
				break;
			}
			
			for(int i=num+1;i<=2*num;i++) {
				int flag = 0;
				if(i==1) {
					continue;
				}
				
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						flag = 1;
						break;
					}
				}
				
				if(flag == 0) {
					// System.out.println("num : "+i);
					count++;
				}
			}
			System.out.println(count);
		}
		
		in.close();
	}

}