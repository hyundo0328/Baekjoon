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
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
   	 	
   	 	int arr[][] = new int[num][2];
   	 	
   	 	for(int i =  0 ; i < num ; i++) {
   	 		String[] str = br.readLine().split(" "); // StringTokenizer 말고 찢는 방법
   	 		arr[i][0] = Integer.parseInt(str[0]);
   	 		arr[i][1] = Integer.parseInt(str[1]);
   	 	}
   	 	
   	 	Arrays.sort(arr, (e1, e2) -> {
					if(e1[0] == e2[0]) {
						return e1[1] - e2[1];
					} else {
						return e1[0] - e2[0];
					}
				});
   	 	
   	 	for(int i = 0; i < num; i++) {
			bw.write(arr[i][0] + " " + arr[i][1]+"\n");
   	 	}

		br.close();
		bw.flush();
		bw.close();
	}

}