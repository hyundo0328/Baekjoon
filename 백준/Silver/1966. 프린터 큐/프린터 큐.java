import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		// T --> 0 : T>0와 T--를 합친 것
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> queue = new LinkedList<>(); 
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<n; i++) {
				queue.offer(new int[] {i, Integer.parseInt(st.nextToken())});	
			}
			
			int count = 0;
			
			while(!queue.isEmpty()) {
				int tmp[] = queue.poll();
				int isMax = 1;
				
				for(int i=0; i<queue.size(); i++) {
					if(tmp[1] < queue.get(i)[1]) {
						queue.offer(tmp);
						for(int j=0; j<i; j++)
							queue.offer(queue.poll());
					
						isMax = 0;
						break;
					}
				}
				
				if(isMax == 0)
					continue;
				
				count++;
				
				if(tmp[0] == m)
					break;
			}
			
			sb.append(count).append('\n');
		}
		
		bw.write(sb+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}