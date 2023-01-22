import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		String str = in.next();
		
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			if('A'<=tmp&&tmp<='C') {
				sum += 3;
			} else if ('D'<=tmp&&tmp<='F') {
				sum += 4;
			} else if ('G'<=tmp&&tmp<='I') {
				sum += 5;
			} else if ('J'<=tmp&&tmp<='L') {
				sum += 6;
			} else if ('M'<=tmp&&tmp<='O') {
				sum += 7;
			} else if ('P'<=tmp&&tmp<='S') {
				sum += 8;
			} else if ('T'<=tmp&&tmp<='V') {
				sum += 9;
			} else {
				sum += 10;
			}
		}
		
		System.out.println(sum);
		
		in.close();
	}

}
