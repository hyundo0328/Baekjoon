import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringTokenizer st;
		
		String str = in.nextLine();
		st = new StringTokenizer(str," ");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String tmp = "";
		
		for(int i=2;i>=0;i--) {
			tmp += s1.charAt(i);
		}
		s1 = tmp;
		tmp = "";
		
		for(int i=2;i>=0;i--) {
			tmp += s2.charAt(i);
		}
		s2 = tmp;

		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		if(num1>=num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		in.close();
	}

}