import java.util.*;

public class DFS와BFS {
    static boolean[] visited;
    static ArrayList<Integer>[] array;

    public static void maind(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int start = scan.nextInt();
        array = new ArrayList[n+1];

        for(int i = 1; i <= n; i++) {
            array[i] = new ArrayList<Integer>();
        }
        for(int i =0; i < m; i++){
            int s = scan.nextInt();
            int e = scan.nextInt();
            array[s].add(e);
            array[e].add(s);
        }
        for(int i =1; i <=n; i++){
            Collections.sort(array[i]);
        }

        visited = new boolean[n+1];
        DFS(start);
        System.out.println();
        visited = new boolean[n+1];
        BFS(start);
        System.out.println();
    }
    static void DFS(int node){
        System.out.print(node + " ");
        visited[node] = true;
        for(int i : array[node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    private static void BFS(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int nowNode = queue.poll();
            System.out.print(nowNode + " ");
            for(int i : array[nowNode]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
