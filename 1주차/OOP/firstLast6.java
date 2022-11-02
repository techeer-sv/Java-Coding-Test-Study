// OOP Style Code
public boolean firstLast6(int[] nums) {
        if(is6InLastOrFist(nums)){
            return true;
        }
        return false;
}

private boolean is6InLastOrFist(int[] nums){
        int firstValue = nums[0];
        int lastValue = nums[nums.length-1];
        return firstValue == 6 || lastValue == 6;
}
