import java.util.*;

class Solution {

    static ArrayList<Integer>[] ary;
    static boolean visited[];

    public int solution(int n, int[][] computers) {

        ary = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i<=n ; i++){
            ary[i] = new ArrayList<Integer>();
        }
        for(int i=0; i < computers.length; i++){
            for(int j = i+1 ; j < computers[0].length ; j++) {
                if (computers[i][j] == 1) {
                    ary[i+1].add(j+1);
                }
            }
        }

        int answer = 0;
        for(int i = 1 ; i < n+1 ; i++){
            if(!visited[i]){
                answer++;
                DFS(i);
            }
        }
        return answer;
    }

    static void DFS(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : ary[v]) {
            if (visited[i] == false) {
                DFS(i);
            }
        }
    }
}
