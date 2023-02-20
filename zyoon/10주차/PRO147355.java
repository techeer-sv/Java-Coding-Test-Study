class Solution {
    public int solution(String t, String p) {

        int size = t.length() - p.length() +1;
        String[] array = new String[size];
        int answer = 0;

        for(int i = 0; i < size; i++){
            array[i] = t.substring(i,i+p.length());
            if(Long.parseLong(array[i]) <= Long.parseLong(p)){ //숫자의 길이제한이 int 범위를 벗어남!
                answer++;
            }
        }
        return answer;
    }
}