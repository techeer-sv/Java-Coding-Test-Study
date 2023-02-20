class Solution {
    public static int solution(String s) {
        char first = s.charAt(0);
        int count = 0;
        int diff = 0;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == diff) {
                answer++;
                first = s.charAt(i); 
            }
            if (first == s.charAt(i)) {
                count++; //첫 글자 나온 횟수
            } else {
                diff++; //다른 글자 나온 횟수
            }
        }
        return answer;
    }
}