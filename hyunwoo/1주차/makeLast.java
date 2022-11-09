public int[] makeLast(int[] nums) {
  int result[] = new int[nums.length * 2];
  result[result.length - 1] = nums[nums.length - 1];
  return result;
}
