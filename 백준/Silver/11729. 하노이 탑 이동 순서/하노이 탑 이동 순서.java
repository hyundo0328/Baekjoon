import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StringBuilder sb = new StringBuilder();
	
	// https://st-lab.tistory.com/96
	public static void hanoi(int n, int a, int b, int c) throws IOException{
		if(n==1) {
			sb.append(a+" "+c+"\n");
			return;
		} 
		
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		hanoi(n-1,a,c,b);
		
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(a+" "+c+"\n");
		
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
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