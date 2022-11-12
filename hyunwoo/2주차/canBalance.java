public boolean canBalance(int[] nums) {
  
  if(nums.length == 1)
    return false;
  
  for(int i = 1; i < nums.length; i++){
    int prev = 0, next = 0;
    for(int j = 0; j < i; j++)
      prev += nums[j];
    for(int k = i ; k < nums.length; k++)
      next += nums[k];
    if(prev == next && prev != 0)
      return true;
  }
  return false;
}
