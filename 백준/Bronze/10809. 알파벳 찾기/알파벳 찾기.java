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
		StringTokenizer st;
		
		int arr[] = new int[26];
		String s = br.readLine();
		
		for(int i=0;i<26;i++) {
			arr[i] = -1;
		}
		
		for(int i=0;i<s.length();i++) {
			int tmp = (int)s.charAt(i)-(int)'a';
			if(arr[tmp]!=-1) {
				continue;
			} else {
				arr[tmp] = i;	
			}
		}
		
		for(int i=0;i<26;i++) {
			bw.write(arr[i]+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}