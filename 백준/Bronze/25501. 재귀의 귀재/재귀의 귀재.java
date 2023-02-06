import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static public int count = 0;
	
	public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) { 
        	count++;
        	return 0; 
        }
        else {
        	count++;
        	return recursion(s, l+1, r-1);
        }
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String st = br.readLine();
			
			count = recursion(st,0,st.length()-1);
			bw.write(isPalindrome(st)+" "+count+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}