import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int gcd = gcd(a,b);
			
			System.out.println(a*b/gcd);
		}
		
		br.close();
	}	

}