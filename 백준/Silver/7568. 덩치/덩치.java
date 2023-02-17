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
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<int[]> arr = new ArrayList<>();
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			arr.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		for(int i=0;i<count;i++) {
			int tmp[] = arr.get(i);
			int rank = 1;
			for(int j=0;j<count;j++) {
				if(i==j) {
					continue;
				} else {
					if(tmp[0]<arr.get(j)[0] && tmp[1]<arr.get(j)[1]) {
						rank++;
					}
				}
			}
			bw.write(rank+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}