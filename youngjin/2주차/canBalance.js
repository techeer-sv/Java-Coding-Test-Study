//CodingBat problems. omitting java main class.
public boolean canBalance(int[] nums) {
    int first = 0;
    int second = 0;
    
    // array of length 1 always returns false
    if (nums.length == 1){
      return false;
    }
    
    //Get the sum of all nums in the array
    for(int i = 0; i < nums.length; i++){
      second += nums[i];
    }

    //iterating from 0 to the second to last number, 
    //add up all the numbers(nums[i]) and store it in first and subtract it from second.
    //before it iterates through the entire array, if first and second becomes the same
    //number, it means there is a point to split in the array. if not, vice versa
    for(int i = 0; i < nums.length - 1; i++) {
        first += nums[i];
        second -= nums[i];
                            
        if(first == second)
            return true;
    }
                                          
    return false;
}
