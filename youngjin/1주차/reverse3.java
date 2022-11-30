//CodingBat problems. omitting java main class.
public int[] reverse3(int[] nums) {
    int[]rnum=new int[nums.length];
    for (int i=0; i <nums.length; i++){
      rnum[i]=nums[nums.length-1-i];
    }
    return rnum;
   }