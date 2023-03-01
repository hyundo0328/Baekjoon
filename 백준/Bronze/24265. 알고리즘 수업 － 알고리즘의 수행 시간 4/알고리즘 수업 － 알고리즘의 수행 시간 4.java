import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i=1;i<=num-1;i++) {
			sum += i;
		}
		bw.write(sum+"\n");
		bw.write("2");
		
		br.close();
		bw.flush();
		bw.close();
	}

}