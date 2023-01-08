import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());	// 새는 곳 개수
        int L = Integer.parseInt(st.nextToken());	// 테이프 길이
        int[] arr = new int[N];
        int answer = 1;
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int now = arr[0] + L - 1;
        for(int i = 1; i < N; i++){
            if(arr[i] > now) {
                answer++;
                now = arr[i] + L - 1;
            }
        }
        System.out.println(answer);
    }
}