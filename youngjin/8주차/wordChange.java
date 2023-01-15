//dfs로 구현
class Solution {
    //방문하였는지 확인하기 위해 boolean배열 생성
    static boolean[] visited;
    //최소한의 방문으로 구하기 위해 큰수 초기화
    static int value = 99999;
    
    public int solution(String begin, String target, String[] words) {
        //글자 수 만큼 배열 초기화
        visited = new boolean[words.length];
        dfs(0, begin, target, words);
        
        if(value == 99999){
           return 0; 
        }
        
        return value;
    }
    //dfs
    public void dfs(int depth,String begin, String target, String[] words) {
        if(begin.equals(target)) {
            //count와 value중 더 작은 값으로 return
            value = Math.min(depth, value);
            return;
        }
 
        for (int i = 0; i < words.length; i++) {
            if(!visited[i] && compare(begin, words[i])) {
                visited[i] = true;
                dfs(depth + 1, words[i], target, words);
                visited[i] = false;
            }
        }
    }
    
    //알파벳 1개만 다른지 확인하는 메서드 compare
    public boolean compare(String s1, String s2) {
        int n = 0;
        
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                n++;
            }      
        }
        if(n == s1.length() - 1){
            return true;
        }
        return false;
    }       
 
}