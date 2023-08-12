import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				// HashSet에서 add를 할 때 중복된 데이터는 false를 출력하면서 추가하지 않는다
				set.add(s.substring(i, j));
			}
		}
		bw.write(set.size()+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}