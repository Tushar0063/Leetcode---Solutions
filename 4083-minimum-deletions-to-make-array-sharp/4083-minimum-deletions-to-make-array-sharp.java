class Solution {
    public int minDeletions(int[] nums) {

 
        int n = nums.length ;
List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i< n-1 ; i++){
            if (nums[i]== nums[i+1]){
                list.add(nums[i]);
            }
        }

        return list.size();
    }
}