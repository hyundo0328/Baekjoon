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

		int num = Integer.parseInt(br.readLine());
		int tmp = -1;
		// int stack[] = new int[num];
		ArrayList<Integer> stack = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			String str[] = br.readLine().split(" ");
			String order = str[0];
			if(str[0].equals("push")) {
				int n = Integer.parseInt(str[1]);
				tmp++;
				stack.add(n);
			} else if(str[0].equals("top")) {
				if(tmp == -1) {
					bw.write(tmp+"\n");
				} else {
					bw.write(stack.get(tmp)+"\n");
				}
			} else if(str[0].equals("size")) {
				bw.write(stack.size()+"\n");
				// bw.write(tmp+"\n");
			} else if(str[0].equals("pop")) {
				if(tmp == -1) {
					bw.write(-1+"\n");
				} else {
					bw.write(stack.get(tmp)+"\n");
					stack.remove(tmp--);
				}
			} else if(str[0].equals("empty")) {
				if(stack.isEmpty()) {
					bw.write(1+"\n");
				} else {
					bw.write(0+"\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}