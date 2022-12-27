import java.util.*;
import java.io.*;

class Test {
    static int N, M, V;
    static boolean[] v;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 시작점 번호
        v = new boolean[N+1];
        arr = new boolean[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }

        Dfs(V);
        v = new boolean[N+1];
        System.out.println("");
        Bfs(V);
    }

    public static void Dfs(int num){
        v[num] = true;
        System.out.print(num + " ");

        for(int a = 1; a < arr.length; a++) {
            if(arr[num][a] && !v[a]) {
                Dfs(a);
            }
        }
    }

    public static void Bfs(int num){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(num);
        v[num] = true;
        System.out.print(num + " ");

        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int a = 1; a < arr.length; a++) {
                if(arr[temp][a] && !v[a]) {
                    System.out.print(a + " ");
                    queue.add(a);
                    v[a] = true;
                }
            }
        }
    }
}
