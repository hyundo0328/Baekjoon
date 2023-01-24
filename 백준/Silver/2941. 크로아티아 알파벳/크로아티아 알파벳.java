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

		String str = br.readLine();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			
			if(tmp == 'c') {
				if((i+1)<str.length() && str.charAt(i+1)=='=') {
					i = i+1;
				} else if ((i+1)<str.length() && str.charAt(i+1)=='-') {
					i = i+1;
				}
			} else if (tmp == 'd') {
				if((i+1)<str.length() && str.charAt(i+1)=='z') {
					if((i+2)<str.length() && str.charAt(i+2)=='=') {
						i = i+2;
					}
				} else if ((i+1)<str.length() && str.charAt(i+1)=='-') {
					i = i+1;
				}
			} else if (tmp == 'l' || tmp == 'n') {
				if ((i+1)<str.length() && str.charAt(i+1)=='j') {
					i = i+1;
				}
			} else if (tmp == 's' || tmp == 'z') {
				if ((i+1)<str.length() && str.charAt(i+1)=='=') {
					i = i+1;
				}
			}
			count++;
		}
		
		bw.write(count+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}