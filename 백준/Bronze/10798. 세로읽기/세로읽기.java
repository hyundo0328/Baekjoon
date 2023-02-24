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
		
		char str[][] = new char[5][15];
		
		
		for(int i=0;i<5;i++) {
			String tmp = br.readLine();
			for(int j=0;j<tmp.length();j++) {
				str[i][j] = tmp.charAt(j);
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(str[j][i]=='\0') {
					continue;
				}
				bw.write(str[j][i]+"");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}