class Solution {
        public int solution(int[] numbers, int target) {
            int answer = 0;
            answer = dfs(numbers, 0, answer, target, 0);
            return answer;
        }

        public int dfs(int[] numbers, int depth, int answer, int target, int count){
            int add = answer + numbers[depth];
            int sub = answer - numbers[depth];

            depth++;
            if(numbers.length == depth){
                if(add == target || sub == target)
                    count++;
                return count;
            }
            else{
                count = dfs(numbers, depth, add, target, count);
                count = dfs(numbers, depth, sub, target, count);
            }
            return count;
        }
    }