import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				if(i==str.length()-1) {
					break;
				}
				count++;
			}
		}

		if(str.charAt(0)==' ') {
			count--;
		}
		count++;
		System.out.println(count);
		
		in.close();
	}

}