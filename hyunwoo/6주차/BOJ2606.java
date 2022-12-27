import java.util.*;
import java.io.*;

class Main {
    static int N, V;
    static boolean[][] arr;
    static boolean[] visit;
    static int answer = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        V = Integer.parseInt(br.readLine());
        visit = new boolean[N+1];
        arr = new boolean[N+1][N+1];
        for(int i = 0; i < V; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }
        visit[1] = true;
        Dfs(1);
        System.out.println(answer);
    }

    public static void Dfs(int start){
        for(int i = 1; i < N + 1; i++){
            if(arr[start][i] && !visit[i]){
                visit[i] = true;
                answer++;
                Dfs(i);
            }
        }
    }
}
