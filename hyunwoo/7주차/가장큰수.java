import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] array = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            array[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(array, Comparator.reverseOrder());
        
        StringBuilder builder = new StringBuilder();
        for(String j: array){
            builder.append(j);
        }
        String answer = builder.toString();
        return answer;
    }
}