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
		st = new StringTokenizer(br.readLine()," ");
		int count = 0;
		
		for(int i=0;i<num;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int flag = 0;
			
			if(tmp == 1) {
				continue;
			}
			for(int j=2;j<tmp;j++) {
				if(tmp%j==0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				count++;
			}
		}
		
		bw.write(count+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}