import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		HashMap<String,String> name_map = new HashMap<String, String>();
		StringTokenizer st;
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(name_map.containsKey(name)) {
				name_map.remove(name);
			} else {
				name_map.put(name, state);
			}
		}
		ArrayList<String> name_list = new ArrayList<String>(name_map.keySet());
		Collections.sort(name_list, Collections.reverseOrder());
		
		for(int i=0;i<name_list.size();i++) {
			bw.write(name_list.get(i)+"\n");
		}
		
		/* 시간초과 코드 */ // ArrayList는 remove에서 n만큼 시간이 걸려 시간복잡도가 O(n^2)이 된다.
//		ArrayList<String> name_list = new ArrayList<String>();
//		StringTokenizer st;
//		for(int i=0;i<count;i++) {
//			st = new StringTokenizer(br.readLine());
//			String name = st.nextToken();
//			String state = st.nextToken();
//			
//			if(state.equals("enter")) {
//				name_list.add(name);
//			} else {
//				name_list.remove(name);
//			}
//		}
//		Collections.sort(name_list, Collections.reverseOrder());
//		
//		for(int i=0;i<name_list.size();i++) {
//			bw.write(name_list.get(i)+"\n");
//		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}