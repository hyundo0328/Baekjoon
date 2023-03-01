import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			int sum = 0;
			ArrayList<Integer> arr = new ArrayList<>();
			
			if(num == -1) {
				break;
			}
			
			for(int i=1;i<=num;i++) {
				if(i==num) {
					break;
				}
				
				if(num%i==0) {
					sum += i;
					arr.add(i);
				}
			}
			
			if(sum == num) {
				bw.write(num+" = ");
				for(int i=0;i<arr.size();i++) {
					if(i == arr.size()-1) {
						bw.write(arr.get(i)+"\n");
					} else {
						bw.write(arr.get(i)+" + ");
					}
				}
			} else {
				bw.write(num+" is NOT perfect.\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}