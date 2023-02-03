import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int i, j, tmp;
		for(i=1;i<n;i++) {
			tmp = arr[i];
			for(j=i;j>0&&tmp>arr[j-1];j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}

		System.out.println(arr[k-1]);
		
		in.close();
	}

}