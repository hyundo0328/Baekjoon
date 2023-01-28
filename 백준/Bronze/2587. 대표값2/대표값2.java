import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[5];
		int average = 0;
		
		for(int i=0;i<5;i++) {
			int num = in.nextInt();
			arr[i] = num;
			average += num;
		}
		
		for(int i=1;i<5;i++) {
			int tmp = arr[i];
			int j;
			
			for(j=i;j>0;j--) {
				if(arr[j-1]<tmp) {
					break;
				}
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}
		
		System.out.println(average/5);
		System.out.println(arr[2]);
		
		in.close();
	}

}