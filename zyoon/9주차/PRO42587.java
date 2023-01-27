import java.util.*;

class Solution { // 중요도가 높은 문서부터 뽑는다. == 우선순위 큐 사용!
    public int solution(int[] priorities, int location) { 
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++)
            queue.offer(priorities[i]); // offer : 추가

        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) { // peek : 검색
                    if(location == i) 
                        return answer;
                    answer++;
                    queue.poll(); // poll : 삭제
                }
            }
        }
        return answer;
    }
}