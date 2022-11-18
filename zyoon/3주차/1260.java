import java.io.*;
import java.util.*;

public class Main {

    public static int[][] connection; //간선 연결상태
    public static boolean[] visited; //방문 확인
    public static Queue<Integer> queue; //BFS-연결된 정점 넣기
    public static int n; //정점 개수
    public static int m; //간선 개수
    public static int v; //시작할 정점

    //<재귀>
    public static void dfs(int start) {
        visited[start] = true; //시작 정점 방문 기록
        System.out.print(start + " ");
        
        //배열 처음부터 돌면서 연결 되어있거나 방문하지 않았다면 탐색 시작
        //다음 연결점을 찾아 시작점을 변경하여 재호출    
        for(int i = 1; i <= n; i++) {
            if(connection[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }

    //<QUEUE>
    public static void bfs(int start) {
        queue = new LinkedList<Integer>();
        queue.add(start); //시작점도 Queue에 넣어야 함
        visited[start] = true;
        System.out.print(start + " ");
        
        //queue가 empty 될 때까지 반복 
        while(!queue.isEmpty()) {
            //큐에 담긴 노드 순차적으로 poll == 삭제
            int temp = queue.poll();
            
            //방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
            for(int i = 1; i <= n; i++) {
                if(connection[temp][i] == 1 && visited[i] == false) {
                queue.add(i);
                visited[i] = true;
                System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        
        connection = new int[n+1][n+1]; //좌표를 그대로 받아들이기 위해 크기+1
        visited = new boolean[n+1]; 
        
        //간선 연결상태 저장
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            connection[x][y] = connection[y][x] = 1;
        }
        
        dfs(v); 
    
        System.out.println();
        Arrays.fill(visited, false); //방문 확인상태 초기화
        
        bfs(v); 
    }

}