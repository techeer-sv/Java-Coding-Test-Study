//CodingBat problems. omitting java main class.
public int[] fix23(int[] nums) {
    for(int i = 0; i < nums.length; i++){
      if(i != 2){
        if(nums[i] == 2 && nums[i+1] == 3){
          nums[i+1] = 0;
        }
      }
    }
    return nums;
  }
  