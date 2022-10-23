//CodingBat problems. omitting java main class.
public boolean no23(int[] nums) {
    boolean temp = false;
    for(int i = 0 ; i < 2; i ++) {
      if(nums[i] == 2 || nums[i] == 3){
        return false;
      }else{
        temp = true;
      }
    }
    return temp;
  }
  