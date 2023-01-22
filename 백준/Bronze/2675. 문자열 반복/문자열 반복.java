import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		for(int i=0;i<num;i++) {
			int count = in.nextInt();
			String str = in.next();
			int len = str.length();
			for(int j=0;j<len;j++) {
				char c = str.charAt(j);
				for(int k=0;k<count;k++) {
					System.out.print(c);
				}
			}
			System.out.println();
		}
		
		in.close();
	}

}