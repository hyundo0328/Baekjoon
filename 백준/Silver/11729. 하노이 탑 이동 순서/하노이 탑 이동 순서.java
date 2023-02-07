import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StringBuilder sb = new StringBuilder();
	
	public static void hanoi(int n, int a, int b, int c) throws IOException{
		if(n==1) {
			sb.append(a+" "+c+"\n");
			return;
		} 
		
		hanoi(n-1,a,c,b);
		sb.append(a+" "+c+"\n");
		hanoi(n-1,b,a,c);
	}
	
	public static void main(String[] args) throws IOException {
		
		int num = Integer.parseInt(br.readLine());
		
		// StringBuilder 사용법
		bw.write((int)(Math.pow(2,num)-1)+"\n");
		hanoi(num, 1, 2, 3);
		bw.write(sb+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}