class Solution {
    public int[] solution(String s) {
        char[] words = s.toCharArray();
        int[] answer = new int[s.length()];
        
        answer[0] = -1; //처음 문자는 당연히 -1
        
        for(int i=1; i<s.length(); i++){
            //lastIndexOf(검색할 값 , 시작위치) - 끝에서부터 검색할 값을 찾기 시작
            int x = s.lastIndexOf(words[i], i-1); //words[i] == s.substring(i, i+1)
            if(x != -1){ //기존 위치 인덱스에서 같은 문자있는 인덱스의 값 빼서 넣기
                answer[i] = i-x; 
            }else{ // x == -1인 경우 ; 같은 문자 없는 경우
                answer[i] = x;
            }
        }
        return answer;
    }
}