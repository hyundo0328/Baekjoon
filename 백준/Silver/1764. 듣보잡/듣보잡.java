import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		
		HashSet<String> set = new HashSet<>(); 
		ArrayList<String> answer = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			set.add(br.readLine());
		}
		
		for(int i=0;i<m;i++) {
			String tmp = br.readLine();
			if(set.contains(tmp)) {
				answer.add(tmp);
			}
		}
		
		Collections.sort(answer);
		bw.write(answer.size()+"\n");
		for(int i=0;i<answer.size();i++) {
			bw.write(answer.get(i)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}