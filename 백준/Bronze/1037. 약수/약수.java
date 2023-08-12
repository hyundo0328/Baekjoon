import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		long count = Long.parseLong(br.readLine());
		ArrayList<Long> num = new ArrayList<Long>();
		st = new StringTokenizer(br.readLine());

		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;
		// while(st.hasMoreTokens()) {
		// 	int N = Integer.parseInt(st.nextToken());
		// 	max = N > max ? N : max;
		// 	min = N < min ? N : min;
		// }
		// bw.write(min*max+"\n");
		
		while(st.hasMoreTokens()) {
			num.add(Long.parseLong(st.nextToken()));
		}
		
		Collections.sort(num);
		
		bw.write(num.get(0)*num.get(num.size()-1)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
