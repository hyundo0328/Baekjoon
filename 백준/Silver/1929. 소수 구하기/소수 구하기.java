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
		
		st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m;i<=n;i++) {
			int flag = 0;
			
            if(i==1){
                continue;
            }
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				bw.write(i+"\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
