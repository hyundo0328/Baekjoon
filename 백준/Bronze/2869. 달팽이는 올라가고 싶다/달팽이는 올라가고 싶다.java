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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		/* Ceil 사용 버전 */
//		int count = (int)Math.ceil((v-a)/(double)(a-b)); 
//		bw.write(count+1+"\n");
		
		/* 일반적인 방법 */
		int count = (v-a)/(a-b); 
		if(count*(a-b)+a==v) {
			bw.write(count+1+"\n");
		} else {
			bw.write(count+2+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}