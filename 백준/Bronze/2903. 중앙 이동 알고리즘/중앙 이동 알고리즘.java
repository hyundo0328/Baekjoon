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
		int sum = 1;
		
		for(int i=0;i<num;i++) {
			sum *= 2;
		}
		sum += 1;
		bw.write(sum*sum + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}