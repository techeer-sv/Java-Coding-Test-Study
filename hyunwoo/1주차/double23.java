public boolean double23(int[] nums) {
  if(nums.length < 2)
    return false;
  if(nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3))
    return true;
  return false;
}
