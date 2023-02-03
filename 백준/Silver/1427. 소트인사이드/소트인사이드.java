import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String num = in.next();
		int arr[] = new int[num.length()];
		
		for(int i=0;i<num.length();i++) {
			arr[i] = num.charAt(i)-'0';
		}
		
		int i, j, tmp;
		for(i=1;i<num.length();i++) {
			tmp = arr[i];
			for(j=i;j>0&&tmp>arr[j-1];j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}
		
		for(i=0;i<num.length();i++) {
			System.out.print(arr[i]);
		}
		
		in.close();
	}

}
