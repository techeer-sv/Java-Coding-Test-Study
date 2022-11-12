//span : 가장 왼쪽에 있는 특정값 a와 가장 오른쪽에 있는 동일값 b 사이 길이
public int maxSpan(int[] nums) {
    int max = 0, span = 0;
    
    for(int i=0; i<nums.length; i++){
      //뒤에서부터 값은 값 확인
      int j = nums.length-1;
      
      //같은 값을 가진 인덱스 찾기
      while(nums[i] != nums[j]){
        j--;
      }

      span = j-i +1;
      
      if(span>max){
        max = span;
      }
    }
    return max;
  }