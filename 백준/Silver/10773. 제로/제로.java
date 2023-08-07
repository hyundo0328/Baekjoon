import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				sum -= stack.pop();
			} else {
				sum += num;
				stack.add(num);
			}
		}
		
		bw.write(sum+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
