import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static long fact(int num) {
		
		if (num == 1 || num == 0) {
			return 1;
		} else {
			return num*fact(num-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long answer = fact(num);
		
		bw.write(answer+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}