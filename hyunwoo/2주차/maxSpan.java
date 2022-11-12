public int maxSpan(int[] nums) {
  int max = 0, i = 0, j = 1, temp = 0;
  
  if(nums.length == 0 || nums.length == 1)
    return nums.length;

  for(i = 0; i < nums.length; i++){
    temp = nums[i];
    for(j = nums.length-1; i <= j; j--){
      if(temp == nums[j]){
        if(max < j - i + 1){
          max = j - i + 1;
        }
      }
    }
  }
  return max;
}
