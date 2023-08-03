import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int count1 = Integer.parseInt(br.readLine());
        int[] cards = new int[count1];
 
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<count1; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(cards);
        int count2 = Integer.parseInt(br.readLine());
 
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<count2; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, count1, num) + " ");
        }
 
        bw.write(sb.toString() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
 
    public static int binarySearch(int[] cards, int index, int search) {
        int first = 0;
        int last = index-1;
        int mid = 0;
 
        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스
 
            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }
 
            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }
 
        return 0;
    }

}