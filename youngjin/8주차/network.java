//dfs로 푼다
// 최대 깊이 까지 탐색을 하여 네트워크를 찾아낸다.
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        //n개의 갯수만큼 boolean배열을 만들고 false로 초기화
        boolean[] bool = new boolean[n];
        
        //bool[i]값이 false인 경우 dfs실행
        //answer ++
        for (int i = 0; i < n; i++) {
          if (!bool[i]) {
            dfs(computers, bool, i);
            answer++;
          }
        }
        return answer;
    }
    //dfs
    boolean[] dfs(int[][] computers, boolean[] bool, int start){
        bool[start] = true;
        
        //자기 자신(start)이 아님
        //bool배열[i]의 값이 false임
        //computer[][]의 값이 1
        //위 조건 충족시 재귀호출 실행
        for(int i = 0; i < computers.length; i++){
            if(start!= i && computers[start][i] == 1 && !bool[i]){
                bool = dfs(computers, bool, i);
            }
        }
        return bool;
    } 
}