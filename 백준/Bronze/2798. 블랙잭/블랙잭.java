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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int answer = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=1;j<n-1;j++) {
				for(int k=2;k<n;k++) {
					if(i==j||i==k||j==k) {
						continue;
					} else {
						sum = arr[i]+arr[j]+arr[k];
						
						if(answer < sum && sum <= m) {
							answer = sum;
						}
					}
				}
			}
		}
		
		bw.write(answer+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
