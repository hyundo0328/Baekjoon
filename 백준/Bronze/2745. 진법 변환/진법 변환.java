import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException { 
		Scanner in = new Scanner(System.in);
		String B = in.next();
		int N = in.nextInt();
		int sum = 0;
		
		// System.out.println(B.length());
		for(int i=B.length()-1;i>=0;i--) {
			int num;
			if ('A' <= B.charAt(i) && B.charAt(i) <= 'Z') {
				num = B.charAt(i) - 'A' + 10;
			} else {
				num = B.charAt(i) - '0';
			}
			// System.out.println("num : "+ num);
			int tmp = 1;
			for (int j = B.length() - 1 - i;j > 0;j--) {
				tmp *= N;	
			}
			// System.out.println("tmp : "+ tmp);
			sum += num * tmp;
		}
		System.out.println(sum);
	}

}