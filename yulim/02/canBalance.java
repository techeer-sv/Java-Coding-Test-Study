public boolean canBalance(int[] nums) {
    int left = 0;
    for (int i = 0; i < nums.length; i++){
        left+=nums[i];
        int right=0;
        for(int j=nums.length-1;j>i;j--){
            right+=nums[j];
        }
        if(right==left) { return true; }
    }
    return false;
}