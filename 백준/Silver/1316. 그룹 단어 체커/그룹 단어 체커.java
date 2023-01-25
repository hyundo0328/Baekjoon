import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 0;
		int arr[] = new int[26];
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<26;k++) {
				arr[k] = -1;
			}
			
			String str = in.next();
			int flag = 0;
			
			if (str.length()<=2) {
				//System.out.println("길이 2 이하");
				count++;
				continue;
			}
			
			for(int j=0;j<str.length();j++) {				
				char c = str.charAt(j);
				// System.out.println("알파벳 위치 : "+(c-97)+" j : "+j);
				
				if(arr[c-97]!=-1) {
					int tmp = arr[c-97];
					// System.out.println(tmp);
					for(int l=tmp;l<j;l++) {
						// System.out.println("l : "+l+" 알파벳 : "+str.charAt(l));
						if(str.charAt(l)!=c) {
							flag = 1;
							break;
						}
					}
				} else {
					arr[c-97] = j;
				}
			}
			
			if(flag == 0) {
				//System.out.println("i : "+i);
				count++;
			}
		}
		
		System.out.println(count);
		
		in.close();
	}

}
