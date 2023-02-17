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
		
		st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 0;
		LinkedList<Integer> deque = new LinkedList<>();
		LinkedList<Integer> find = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			deque.add(i);
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());
			
			// bw.write("num : "+num+" index : "+(deque.indexOf(num)+1)+"\n");
			// bw.write(Math.ceil(deque.size()/(double)2)+"\n");
			// bw.write("num : "+num+", 위치 : "+(deque.indexOf(num)+1)+", deque : "+deque+" "+count+"\n");
			if((deque.indexOf(num)+1) <= Math.ceil(deque.size()/(double)2)) {
				while(true) {
					if(num == deque.peekFirst()) {
						deque.pollFirst();
						break;
					}
					deque.addLast(deque.pollFirst());
					count++;
					// bw.write("num : "+num+", 위치 : "+(deque.indexOf(num)+1)+", deque : "+deque+" "+count+"\n");
				}
			} else {
				while(true) {
					if(num == deque.peekFirst()) {
						deque.pollFirst();
						break;
					}
					deque.addFirst(deque.pollLast());
					count++;
					// bw.write("num : "+num+", 위치 : "+(deque.indexOf(num)+1)+", deque : "+deque+" "+count+"\n");
				}
				
			}
		}
		
		bw.write(count+"");
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
