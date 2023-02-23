import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=count;i++) {
			String str = br.readLine();
			
			bw.write(str.charAt(0)+""+str.charAt(str.length()-1)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}