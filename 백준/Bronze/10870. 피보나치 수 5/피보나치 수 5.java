import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	// int count = 0; // 전역변수(객체변수) : 같은 클래스에서 호출 가능
	// static int count[]; // 전역변수(클래스변수) : 다른 클래스에서 호출 가능
	
	public static int fibonacci(int num) {
		if(num == 0) {
			return 0;
		}
		if(num == 1) {
			return 1;
		}
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());		
		
		bw.write(fibonacci(num)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
