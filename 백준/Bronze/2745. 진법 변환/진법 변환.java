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
		int len = B.length();
		
		// System.out.println(B.length());
		
		while(len != 0) {
			int num;
			if ('A' <= B.charAt(B.length()-len) && B.charAt(B.length()-len) <= 'Z') {
				num = B.charAt(B.length()-len) - 'A' + 10;
			} else {
				num = B.charAt(B.length()-len) - '0';
			}
			sum += Math.pow((double)N, (double)(len-1)) * num;
			
			len--;
		}
		System.out.println(sum);
	}

}