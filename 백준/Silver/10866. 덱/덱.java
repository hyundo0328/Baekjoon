import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> deque = new LinkedList<>();
		
		for(int i=0;i<count;i++) {
			String str[] = br.readLine().split(" ");
			String order = str[0];
			
			if(str[0].equals("push_front")) {
				int n = Integer.parseInt(str[1]);
				
				deque.addFirst(n);
			} else if(str[0].equals("push_back")) {
				int n = Integer.parseInt(str[1]);
				
				deque.addLast(n);
			} else if(str[0].equals("pop_front")) {
				if(deque.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(deque.pollFirst()+"\n");
				}
			} else if(str[0].equals("pop_back")) {
				if(deque.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(deque.pollLast()+"\n");
				}
			} else if(str[0].equals("size")) {
				bw.write(deque.size()+"\n");
			} else if(str[0].equals("empty")) {
				if(deque.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if(str[0].equals("front")) {
				if(deque.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekFirst()+"\n");
				}
			} else if(str[0].equals("back")) {
				if(deque.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekLast()+"\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}