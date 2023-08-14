import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		set.add("ChongChong");  //총총이는 무조건 나오므로 추가
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String person1 = st.nextToken();
            String person2 = st.nextToken();
            if (set.contains(person1) || set.contains(person2)) {
                set.add(person1);
                set.add(person2);
            }
        }
		bw.write(set.size()+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
