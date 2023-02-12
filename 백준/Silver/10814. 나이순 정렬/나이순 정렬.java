import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String str[][] = new String[num][2];
		
		for(int i=0;i<num;i++) {
			String st[] = br.readLine().split(" ");
			str[i][0] = st[0];
			str[i][1] = st[1];
		}
		
//		Arrays.sort(str, new Comparator<String[]>() {
//			@Override
//			public int compare(String[] s1, String[] s2) {
//				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
//			}
//			
//		});
		
		Arrays.sort(str, (o1,o2)->{
			return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
		});
		
		for(int i=0;i<num;i++) {
			bw.write(str[i][0] + " " + str[i][1]+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}