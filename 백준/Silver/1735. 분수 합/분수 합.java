import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int gcd(int b_1, int b_2) {
		while(b_2!=0) {
			int r = b_1 % b_2;
			
			b_1 = b_2;
			b_2 = r;
		}
		
		return b_1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int a_1 = Integer.parseInt(st.nextToken());
		int b_1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a_2 = Integer.parseInt(st.nextToken());
		int b_2 = Integer.parseInt(st.nextToken());
		
		int numer = a_1*b_2+a_2*b_1;
		int deno = b_1*b_2;
		int divide = gcd(numer, deno);
		while(true) {
			if (divide == 1) {
				System.out.println(numer+" "+deno);
				break;
			}
			numer = numer/divide;
			deno = deno/divide;
			divide = gcd(numer, deno);
		}
		
		br.close();
	}

}
