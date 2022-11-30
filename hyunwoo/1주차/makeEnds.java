public int[] makeEnds(int[] nums) {
  int result[] = new int[2];
  result[0] = nums[0];
  result[1] = nums[nums.length-1];
  return result;
}
