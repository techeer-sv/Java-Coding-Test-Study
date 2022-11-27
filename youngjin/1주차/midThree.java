//CodingBat problems. omitting java main class.
public int[] midThree(int[] nums) {
    if(nums.length==3){
    return nums;
  }else{
    int[] ans = {nums[(nums.length/2)-1], nums[(nums.length/2)], nums[(nums.length/2)+1]};
    return ans;
  }
}
