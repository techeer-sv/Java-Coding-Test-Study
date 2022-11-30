public int[] rotateLeft3(int[] nums) {
  int temp = nums[0];
  for(int i = 1; i < 3; i++){
    nums[i-1] = nums[i];
  }
  nums[2] = temp;
  return nums;
}
