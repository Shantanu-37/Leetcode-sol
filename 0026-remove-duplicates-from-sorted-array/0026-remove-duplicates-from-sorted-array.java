class Solution {
    public int removeDuplicates(int[] nums) {
        // 1, 1, 2, 3, 4, 3, 4 --> 1, 2, 3, 4, 
        //                   j end 
        // -  -  -  -  k = 4 ans.
        // let's code

      int k = 1;
      for(int j = 1; j < nums.length; j++){
        if (nums[j] != nums[j-1]) {
            nums[k] = nums[j];
            k = k + 1;
        }
      }
      return k;
}
}