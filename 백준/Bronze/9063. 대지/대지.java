import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringTokenizer st;
		
		int n = Integer.parseInt(in.nextLine());
		int min[][] = new int[1][2];
		int max[][] = new int[1][2];
		min[0][0] = 10001;
		min[0][1] = 10001;
		max[0][0] = -10001;
		max[0][1] = -10001;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(in.nextLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x > max[0][0]) {
				max[0][0] = x;
			}
			if(y > max[0][1]) {
				max[0][1] = y;
			}
			
			if(x < min[0][0]) {
				min[0][0] = x;
			}
			if(y < min[0][1]) {
				min[0][1] = y;
			}
		}
		// System.out.println("("+max[0][0]+", "+max[0][1]+") ("+min[0][0]+", "+min[0][1]+")");
		
		System.out.println((max[0][0]-min[0][0])*(max[0][1]-min[0][1]));
	}
}