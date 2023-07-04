import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		for (int i=0;i<count;i++) {
			int price = Integer.parseInt(br.readLine());
			quarter = price / 25;
			price -= 25*quarter;
			dime = price / 10;
			price -= 10*dime;
			nickel = price / 5;
			price -= 5*nickel;
			penny = price / 1;
			price -= 1*penny;
			
			bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
