// PP Style Code
public int[] reverse3(int[] nums) {
        List<Integer> reversList = new ArrayList<>();
        int length = nums.length;
        for(int idx=length-1; idx>=0; idx--){
            reversList.add(nums[idx]);
        }
        return reversList.stream().mapToInt(i -> i).toArray();
}
