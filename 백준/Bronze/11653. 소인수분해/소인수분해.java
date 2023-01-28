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
		
		while(num>1) {
			int tmp = 2;
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					tmp = i;
					break;
				}
			}
			
			bw.write(tmp+"\n");
			num /= tmp;
			// bw.write("num : "+num+"\n\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}