import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int five = 5;
		int three = 3;
		int count = 0;
		int flag = 0;
		
		for(int i=(num/five);i>=0;i--) {
			int tmp = num-five*i;
			if(tmp%three == 0) {
				flag = 1;
				System.out.println(i+tmp/three);
				break;
			}
		}
		if(flag == 0) {
			System.out.println(-1);
		}
		
		in.close();
	}

}