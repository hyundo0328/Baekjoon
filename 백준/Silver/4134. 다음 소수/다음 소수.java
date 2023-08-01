import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++) {
			BigInteger bi = new BigInteger(br.readLine()); // Long은 4*10^9보다 작기 때문에 BigInteger라는 것을 사용해야 한다. 
			if(bi.isProbablePrime(10)){ //만약 지금 받은 매개변수가 소수
	            bw.write(bi+"\n"); 
	        }else{
	            bw.write(bi.nextProbablePrime()+"\n"); //다음 소수 반환
	        }
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}