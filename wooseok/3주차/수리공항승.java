import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 수리공항승 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int water[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            water[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(water);
        double left = water[0] - 0.5;
        int cnt = 1;
        for(int i=0; i<N; i++) {
            if(left+L < water[i]) {
                cnt++;
                left = water[i] - 0.5;
            }
        }
        System.out.println(cnt);
    }
}