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
		
		int count = (int)Math.ceil((v-a)/(double)(a-b)); 
		bw.write(count+1+"\n");
//		if(v%(count*(a-b)+a)==0) {
//			
//		} else {
//			bw.write(v/(a-b)+1+"\n");
//		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}