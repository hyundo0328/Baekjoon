import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		
		for(int i=0;i<t;i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
		int i=0,j=0;
		for(i=1;i<t;i++) {
			int tmp = arr[i];
			for(j=i;j>0&&arr[j-1]>tmp;j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}
		
		for(i=0;i<t;i++) {
			bw.write(arr[i]+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}