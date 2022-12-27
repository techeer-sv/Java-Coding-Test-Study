import java.util.*;
import java.io.*;

class Main {
    static int N, K;
    static int[] P;
    static int answer;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 종류의 개수
        K = Integer.parseInt(st.nextToken()); // 만들고자 하는 가격

        P = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            P[i] = a;
        }

        for(int i = N-1; i >= 0; i--){
            if(K / P[i] > 0){
                int temp = K / P[i];
                answer += temp;
                K -= P[i] * temp;
            }
            if(K == 0){
                break;
            }
        }
        System.out.println(answer);
    }
}
