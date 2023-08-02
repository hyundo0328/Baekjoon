import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sosu = new int[1000001];
		for(int i=2;i<=1000000;i++) {
			int flag = 0;
			
			if(sosu[i] == 0){
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						sosu[i] = 1;
						break;
					}
				}
			}
			// System.out.println("sosu["+i+"]: "+sosu[i]);
		}
		
		int count = Integer.parseInt(br.readLine());
		for(int i=1;i<=count;i++) {
			int num = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int j=2;j<=num/2;j++) {
				if(sosu[j]==0 && sosu[num-j]==0) {
					answer++;
				}
			}
			
			System.out.println(answer);
		}
		
		br.close();
	}

}