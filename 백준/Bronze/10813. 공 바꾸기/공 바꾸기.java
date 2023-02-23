import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int arr[] = new int[n+1];	
		
		for(int i=1;i<=n;i++) {
			arr[i] = i;
		}
		
		for(int i=0;i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int tmp;
			
			tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		for(int i=1;i<=n;i++) {
			bw.write(arr[i]+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
