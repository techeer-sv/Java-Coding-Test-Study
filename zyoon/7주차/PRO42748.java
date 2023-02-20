import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            //copyOfRange(arr, n1, n2) (원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스)
            int[] list = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(list); //배열 오름차순 정렬
            answer[i] = list[commands[i][2]-1];
        }

        return answer;
    }
}
