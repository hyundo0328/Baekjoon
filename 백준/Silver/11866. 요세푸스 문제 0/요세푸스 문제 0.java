import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> queue = new LinkedList<>();
		LinkedList<Integer> pus = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		
		int tmp = 1;
		while(queue.size() != 0) {
			if(tmp % k == 0) {
				pus.add(queue.poll());
			} else {
				queue.add(queue.poll());
			}
			tmp++;
		}
		
		bw.write("<");
		for(int i=0;i<n;i++) {
			if(i == n-1) {
				bw.write(pus.get(i)+"");
			} else {
				bw.write(pus.get(i)+", ");
			}
		}
		bw.write(">\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}