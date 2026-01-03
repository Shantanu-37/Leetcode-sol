class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> l1 = new ArrayList<>();
        for(int a : nums)
        l1.add(a);
        Collections.rotate(l1, k);

        for(int i = 0; i <l1.size(); i++){
            nums[i] =  l1.get(i);
        }
    }
}