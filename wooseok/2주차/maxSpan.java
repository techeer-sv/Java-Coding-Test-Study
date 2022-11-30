public int maxSpan(int[] nums) {
    if(nums.length == 0) {
        return 0;
    }
    int maxSpan=1;
    for(int i=0; i<nums.length; i++) {
        int firstNum = i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i] == nums[j]) {
                if(maxSpan < (j-i+1)) {
                    maxSpan = j-i+1;
                }
            }
        }
    }
    return maxSpan;
}
