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
		
		float average = 0;
		float score = 0;
		
		for(int i=1;i<=20;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String str = st.nextToken();
			float num = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
		
			if(grade.equals("A+")) {
				average += num*4.5;
				score += num;
			} else if(grade.equals("A0")) {
				average += num*4.0;
				score += num;
			} else if(grade.equals("B+")) {
				average += num*3.5;
				score += num;
			} else if(grade.equals("B0")) {
				average += num*3.0;
				score += num;
			} else if(grade.equals("C+")) {
				average += num*2.5;
				score += num;
			} else if(grade.equals("C0")) {
				average += num*2.0;
				score += num;
			} else if(grade.equals("D+")) {
				average += num*1.5;
				score += num;
			} else if(grade.equals("D0")) {
				average += num*1.0;
				score += num;
			} else if(grade.equals("F")) {
				average += num*0;
				score += num;
			}
		}
		
		bw.write(String.format("%.6f", average/score));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
