class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) 
                    break; // 앞에 값이 뒤에 값보다 커지면 ()== 가격 떨어짐) 빠져나가기
            }
        }
        return answer;
    }
}