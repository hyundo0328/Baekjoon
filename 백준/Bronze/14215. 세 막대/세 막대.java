import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int arr[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		Arrays.sort(arr);
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			bw.write(arr[0]*3+"\n");
		} else if (arr[2] >= arr[1]+arr[0]) {
			bw.write((arr[1]+arr[0])*2-1+"\n");
		} else {
			bw.write(arr[0]+arr[1]+arr[2]+"\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
