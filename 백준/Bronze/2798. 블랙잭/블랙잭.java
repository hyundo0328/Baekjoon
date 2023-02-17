import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		int tmp = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			tmp += arr.get(i);
			for(int j=i+1;j<n;j++) {
				tmp += arr.get(j);
				for(int k=j+1;k<n;k++) {
					tmp += arr.get(k);
					
					if(0<=m-tmp && m-tmp<=m-sum) {
						sum = tmp;
						// bw.write(arr.get(i)+" "+arr.get(j)+" "+arr.get(k)+"\n");
					}
					
					tmp -= arr.get(k);
				}
				tmp -= arr.get(j);
			}
			tmp -= arr.get(i);
		}
		
		bw.write(sum+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
