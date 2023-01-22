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
		
		int num = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum = 0;
		
		for(int i=0;i<num;i++) {
			// bw.write((int)s.charAt(i)-(int)'0'+"\n");
			sum += (int)s.charAt(i)-(int)'0';
		}
		bw.write(sum+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}