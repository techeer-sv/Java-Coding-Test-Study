public int[] maxEnd3(int[] nums) {
  int large = nums[0];
  if(nums[0] < nums[2])
    large = nums[2];
  int result[] = new int[3];
  for(int i = 0; i < 3; i++){
    result[i] = large;
  }
  return result;
}
