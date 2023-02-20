import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] str = new String[numbers.length];
        
        for(int i = 0; i < str.length; i++){
            str[i] = String.valueOf(numbers[i]);  
        }
        
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String n1, String n2) {
                return (n2+n1).compareTo(n1+n2);
            }
        });

        for(int i = 0; i < str.length; i++)
            answer += str[i];

        if(str[0].equals("0")) answer = "0";
        
        return answer;
    }
}