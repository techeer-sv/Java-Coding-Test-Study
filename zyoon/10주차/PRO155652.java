class Solution {
    public String solution(String s, String skip, int index) {
        char[] words = s.toCharArray(); //각각 문자니까 배열로 저장

        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{ // do-while은 최소 1번 실행, while은 아니면 실행X
                    words[i]++;
                    if(words[i] > 'z'){ // 범위 초과시 a로 돌아옴
                        words[i] -= 26; // == 'a'와 동일
                    }
                }while(skip.contains(String.valueOf(words[i])));
            }
        }

        String answer = String.valueOf(words);
        return answer;
    }
}