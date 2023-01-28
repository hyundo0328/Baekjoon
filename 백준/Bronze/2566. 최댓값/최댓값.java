import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      StringTokenizer st;
	      Scanner in = new Scanner(System.in);
	      
	      int[][] arr = new int[9][9];
	      int max = -1;
	      int row = -1;
	      int col = -1;
	      
	      for(int i=0;i<9;i++) {
	         for(int j=0;j<9;j++) {
	            arr[i][j] = in.nextInt();
	            if(arr[i][j]>max) {
	               max = arr[i][j];
	               row = i;
	               col = j;
	            }
	         }
	      }
	      
	      bw.write(max+"\n");
	      bw.write((row+1)+" "+(col+1));
	      
	      br.close();
	      bw.flush();
	      bw.close();
	}

}