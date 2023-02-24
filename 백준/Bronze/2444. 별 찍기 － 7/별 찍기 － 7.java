import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				sb.append(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i=num-1;i>=1;i--) {
			for(int j=num-i;j>=1;j--) {
				sb.append(" ");
			}
			for(int j=2*i-1;j>=1;j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		bw.write(sb+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
