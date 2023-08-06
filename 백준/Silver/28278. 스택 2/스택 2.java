import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int x;
			if(num == 1) {
				x = Integer.parseInt(st.nextToken());
				stack.add(x);
			} else if(num==2) {
				if(stack.empty()) {
					bw.write("-1\n");
				} else {
					bw.write(stack.pop()+"\n");
				}
			} else if(num==3) {
				bw.write(stack.size()+"\n");
			} else if(num==4) {
				if(stack.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if(num==5) {
				if(stack.empty()) {
					bw.write("-1\n");
				} else {
					bw.write(stack.peek()+"\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}