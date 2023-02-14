import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++) {
			int tmp = -1;
			int flag = 0;
			String gwalho = br.readLine();
			
			for(int j=0;j<gwalho.length();j++) {
				if(gwalho.charAt(j) == '(') {
					tmp++;
				} else {
					tmp--;
					if(tmp < -1) {
						flag = 1;
						break;
					}
				}
			}
			if(tmp != -1 || flag == 1) {
				bw.write("NO\n");
			} else {
				bw.write("YES\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}