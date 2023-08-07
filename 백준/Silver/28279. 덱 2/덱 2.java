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
		StringTokenizer st;
		
		LinkedList<Integer> dueue = new LinkedList<Integer>();
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int x = 0;
			
			if(num == 1) {
				x = Integer.parseInt(st.nextToken());
				
				dueue.addFirst(x);
			} else if (num == 2) {
				x = Integer.parseInt(st.nextToken());
				
				dueue.addLast(x);
			} else if (num == 3) {
				if(dueue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(dueue.pollFirst()+"\n");
				}
			} else if (num == 4) {
				if(dueue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(dueue.pollLast()+"\n");
				}
			} else if (num == 5) {
				bw.write(dueue.size()+"\n");
			} else if (num == 6) {
				if(dueue.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (num == 7) {
				if(dueue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(dueue.peekFirst()+"\n");
				}
			} else if (num == 8) {
				if(dueue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(dueue.peekLast()+"\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
