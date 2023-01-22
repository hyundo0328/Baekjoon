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
		int max = -1, flag = 0, tmp = -1;
		
		String str = br.readLine();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if((int)c >= 97) {
				arr[(int)c - 97] += 1;
			} else {
				arr[(int)c - 65] += 1;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(arr[i]>tmp) {
				tmp=arr[i];
				flag = 0;
				max = i;
			} else if (arr[i]==tmp) {
				flag = 1;
			}
		}
		
		if(flag == 1) {
			bw.write("?");
		} else {
			bw.write((char)(max+65));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
