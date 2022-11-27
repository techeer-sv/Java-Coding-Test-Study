public boolean canBalance(int[] nums) {
    for(int idx=0; idx<nums.length;idx++) {
        int[] nums1 = Arrays.copyOfRange(nums,0,idx);
        int[] nums2 = Arrays.copyOfRange(nums,idx,nums.length);
        if(sumArray(nums1) == sumArray(nums2)){
            return true;
        }
    }
    return false;
}

private int sumArray(int[] nums){
    int sum = 0;
    for(int num : nums) {
        sum += num;
    }
    return sum;
}