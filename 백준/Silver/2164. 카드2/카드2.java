import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=num;i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		bw.write(queue.peek()+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}