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
		
		int xy[][] = new int[3][2];
		int x = 0;
		int y = 0;
		
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine()," ");
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		
		if(xy[0][0] == xy[1][0]) {
			x = xy[2][0];
		} else if(xy[0][0] == xy[2][0]) {
			x = xy[1][0];
		} else {
			x = xy[0][0];
		}
		
		if(xy[0][1] == xy[1][1]) {
			y = xy[2][1];
		} else if(xy[0][1] == xy[2][1]) {
			y = xy[1][1];
		} else {
			y = xy[0][1];
		}
		
		bw.write(x + " " + y);
		
		br.close();
		bw.flush();
		bw.close();
	}

}