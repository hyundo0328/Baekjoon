import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		ArrayDeque<int[]> link = new ArrayDeque<int[]>();
		int[] arr = new int[count];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		int tmp = arr[0];
		
		for(int i=1; i<count; i++){
			link.add(new int[] {(i+1), arr[i]}); // {풍선 idx, 내용}
		}
		
		while(!link.isEmpty()) {
			if(tmp >0) {
				for(int i=1; i<tmp; i++) {
					link.addLast(link.pollFirst());
				}
				
				int[] next = link.pollFirst();
				tmp = next[1];
				sb.append(next[0]+" ");
			}
			else {
				for(int i=1; i<Math.abs(tmp); i++	) {
					link.addFirst(link.pollLast());
				}
				
				int[] next = link.pollLast();
				tmp = next[1];
				sb.append(next[0]+" ");
			}
		}
		
		bw.write(sb+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
