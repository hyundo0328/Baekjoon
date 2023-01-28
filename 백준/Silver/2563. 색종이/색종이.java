import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int[][] arr = new int[101][101];
		int count = 0;
		
		for(int i=0;i<num;i++) {
			int row = in.nextInt();
			int col = in.nextInt();
			
			for(int j=row;j<row+10;j++) {
				for(int k=col;k<col+10;k++) {
					if(j>100||k>100) {
						break;
					}
					
					if(arr[j][k]==1) {
						continue;
					} else {
						arr[j][k] = 1;
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
		in.close();
	}

}