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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int flag = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				if(count==k) {
					bw.write(i+"\n");
					flag = 1;
					break;
				}
			}
		}
		
		if(flag == 0) {
			bw.write(flag+"");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
