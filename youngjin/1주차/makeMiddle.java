//CodingBat problems. omitting java main class.
public int[] makeMiddle(int[] nums) {
    if(nums.length==2){
      return nums;
    }else{
      int[] ans = {nums[(nums.length/2)-1], nums[(nums.length/2)]};
      return ans;
    }
  }
  