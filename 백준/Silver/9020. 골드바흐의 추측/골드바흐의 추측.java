import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10001];
		
		// 2~10000까지 소수 배열에 저장
		for(int i=2;i<10000;i++) {
			int flag = 0;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				arr[i] = 1;
			}
		}
		
//		for(int i=1;i<100;i++) {
//			System.out.println("숫자 "+i+" : "+arr[i]);
//		}
		
		int t = in.nextInt();
		
		for(int i=0;i<t;i++) {
			int num = in.nextInt();
			int half = num/2;
			
			if(arr[half] == 1) {
				System.out.println(half+" "+half);
			} else {
				do {
					half++;
				} while(arr[half]!=1 || arr[num-half]!=1);
				
				//System.out.println(half);
				System.out.println((num-half)+" "+half);
			}
		}
		
		in.close();
	}

}
