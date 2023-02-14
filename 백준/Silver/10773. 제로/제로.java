import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		ArrayList<Integer> stack = new ArrayList<>();
		int tmp = -1;
		int sum = 0;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				sum -= stack.get(tmp);
				stack.remove(tmp--);
			} else {
				sum += n;
				tmp++;
				stack.add(n);
			}
		}
		
		bw.write(sum+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}