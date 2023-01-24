import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringTokenizer st;
		
		String str = in.nextLine();
		st = new StringTokenizer(str, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(B>=C) {
			System.out.println("-1");
		} else {
			System.out.println(A/(C-B)+1);
		}
		
		in.close();
	}

}