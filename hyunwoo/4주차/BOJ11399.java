import java.util.*;
import java.io.*;

class Main {
    static int N;
    static int[] A1, A2;
    static int answer;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 사람 명수

        A1 = new int[N];
        A2 = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            A2[i] = a;
            A1[i] = a;
        }

        Arrays.sort(A2);
        Arrays.sort(A1);
        for(int i = 0; i < N; i++){
            answer += A2[i];
            for(int j = i + 1; j < N; j++) {
                A2[j] += A1[i];
            }
        }
        System.out.println(answer);
    }
}
