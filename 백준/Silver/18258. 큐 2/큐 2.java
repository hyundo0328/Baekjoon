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
		
		int count = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			String type = st.nextToken();
			int x;
			if(type.equals("push")) {
				x = Integer.parseInt(st.nextToken());
				queue.add(x);
			} else if(type.equals("pop")) {
				if(queue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(queue.poll()+"\n");
				}
			} else if(type.equals("size")) {
				bw.write(queue.size()+"\n");
			} else if(type.equals("empty")) {
				if(queue.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if(type.equals("front")) {
				if(queue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(queue.getFirst()+"\n");
				}
			} else if(type.equals("back")) {
				if(queue.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(queue.getLast()+"\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}