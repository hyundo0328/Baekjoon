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
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		LinkedList<Integer> tmp = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			arr[i] = i;
		}
		
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for(int j=c;j<=b;j++) {
				tmp.add(arr[j]);
			}
			for(int j=a;j<=c-1;j++) {
				tmp.add(arr[j]);
			}
			for(int j=a;j<=b;j++) {
				arr[j] = tmp.poll();
			}
		}
		
		for(int i=1;i<=n;i++) {
			bw.write(arr[i]+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}