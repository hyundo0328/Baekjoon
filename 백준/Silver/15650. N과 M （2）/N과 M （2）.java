import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int count = 0;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
		arr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			int tmp = 0;
			int flag = 0;
			for (int val : arr) {
				if(tmp > val) {
					flag = 1;
					break;
				} else {
					tmp = val;
				}
			}
			if(flag == 0) {
				for (int val : arr) {
					sb.append(val).append(' ');
				}
				sb.append('\n');
			}
			return;
		}
 
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;			
				dfs(n, m, depth + 1);
				visit[i] = false;
			}
		}
	}

}