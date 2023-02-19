//가중치가 없는 그래프이므로 BFS를 통해 최단거리를 구할 수 있다.
import java.util.*;
class Solution {
    //사방탐색을 위한 배열
    int[] dx = {0,0,1,-1};
    int[] dy = {-1,1,0,0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        
        //시작 위치 방문
        visited[0][0] = 1; 
        
        //bfs
        bfs(maps, visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
    public void bfs(int[][] maps, int[][] visited){
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{0,0});
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            
            //4방탐색
            for(int i = 0; i < 4; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 현 방향으로 갈 수 있는지 체크
                // 이미 방문했는지 체크
                if(nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length 
                   && visited[nx][ny] == 0 && maps[nx][ny] == 1){
                    visited[nx][ny] = visited[x][y] + 1;
                    //큐에 넣기
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
}