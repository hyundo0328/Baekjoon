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
		
		while(true) {
			String munjang = br.readLine();
			if(munjang.charAt(0) == '.') {
				break;
			}
			
			ArrayList<String> stack = new ArrayList<>();
			int tmp1 = -1;
			int tmp2 = -1;
			int tmp = -1;
			int flag = 0;
			
			for(int i=0;i<munjang.length();i++) {
				if(munjang.charAt(i) == '(') {
					// tmp1++;
					tmp++;
					stack.add(String.valueOf(munjang.charAt(i)));
					// bw.write("Push "+stack+"\n");
				} else if (munjang.charAt(i) == ')') {
					if(tmp <= -1 || stack.get(tmp).equals("[")) {
						flag = 1;
						break;
					} else {
						// tmp1--;
						stack.remove(tmp);
						// bw.write("Pop "+stack+"\n");
						tmp--;
					}
				}
				
				if(munjang.charAt(i) == '[') {
					// tmp2++;
					tmp++;
					stack.add(String.valueOf(munjang.charAt(i)));
					// bw.write("Push "+stack+"\n");
				} else if (munjang.charAt(i) == ']') {
					if(tmp <= -1 || stack.get(tmp).equals("(")) {
						flag = 1;
						break;
					} else {
						// tmp2--;
						stack.remove(tmp);
						// bw.write("Pop "+stack+"\n");
						tmp--;
					}
				}
			}
			
			if(tmp != -1 || flag == 1) {
				bw.write("no\n");
			} else {
				bw.write("yes\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
