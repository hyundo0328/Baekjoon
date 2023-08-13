import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		int answer = 0;
		
		for(int i=0;i<count;i++) {
			String tmp = br.readLine();
			if(tmp.equals("ENTER")) {
				set = new HashSet<String>();
				// bw.write("ENTER임\n");
				continue;
			}
			if(!set.contains(tmp)) {
				set.add(tmp);
				answer++;
				// bw.write(tmp+" "+answer+"\n");
			}
		}
		
		bw.write(answer+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}