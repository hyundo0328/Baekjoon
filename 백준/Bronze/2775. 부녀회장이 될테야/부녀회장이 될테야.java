import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int arr[][] = new int[15][15];
		
		for(int i=0;i<15;i++) {
			if(i==0) {
				for(int j=1;j<=14;j++) {
					arr[i][j] = j;
				}
			} else {
				for(int j=1;j<=14;j++) {
					if(j==1) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j] + arr[i][j-1];
					}
				}
			}
		}
	
		int num = in.nextInt();
		for(int i=0;i<num;i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(arr[k][n]);
		}
		
		in.close();
	}

}