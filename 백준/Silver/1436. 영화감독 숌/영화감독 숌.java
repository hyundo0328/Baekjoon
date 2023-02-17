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
		
		int six = 666;
		int count = 0;
		
		while(true) {
			// int를 String으로 바꾸어 contains 메소드를 사용하여 숫자에 666이 있으면 count 증가
			if(Integer.toString(six).contains("666")) {
				count++;
			}
			
			if (count == num) {
				break;
			}
			
			six++;
		}
		
		bw.write(six+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}