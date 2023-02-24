import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int flag = 1;
		
		for(int i=0;i<str.length()/(float)2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				flag = 0;
				break;
			}
		}
		
		bw.write(flag+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}