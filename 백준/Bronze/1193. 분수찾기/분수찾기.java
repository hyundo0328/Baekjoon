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
		int count = 1;
		if(num == 1) {
			bw.write("1/1");
		} else {
			while(sum < num) {
				count++;
				sum += count;
			}
			if(count%2==0) {
				System.out.println(((count)-(sum-num))+"/"+(sum-num+1));
			} else {
				System.out.println((sum-num+1)+"/"+(count-(sum-num)));
			}
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}