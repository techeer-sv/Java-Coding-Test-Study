public boolean canBalance(int[] nums) {
    int sum = 0;
    
    for(int i=0; i< nums.length ; i++){
        sum += nums[i];
    }
    
    //전체가 짝수 합이 아니면 나눴을 때 같은 값이 될 수 없음
    if(sum % 2==0){
      int sum1 = 0, sum2 = 0;
        
        for(int i=0; i<nums.length; i++){
                sum1 += nums[i];
                sum2 = sum - sum1;
                
                if(sum2 == sum1)
                  return true;
        }
    }
        
    return false;
    
}