import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		// ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		// 배열을 사용할 때는 Arrays를 사용하여 sort를 하고 ArrayList를 사용할 때는 Collections를 사용하여 sort를 한다.
		
		for(int i=0;i<num;i++) {
			bw.write(arr[i]+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}