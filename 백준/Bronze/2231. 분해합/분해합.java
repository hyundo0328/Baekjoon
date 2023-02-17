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
		int flag = 0;
		int n = 1;
		int sum = 0;
		int tmp = 0;
		
		while(n != num) {
			tmp = n;
			sum = n;
			
			while(tmp != 0) {
				sum += tmp%10;
				tmp /= 10;
			}
			
			// bw.write(num+" "+n+" "+sum+"\n");
			if(sum == num) {
				flag = 1;
				break;
			}
			
			n++;
		}
		
		if(flag == 0) {
			bw.write("0");
		} else {
			bw.write(n+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
