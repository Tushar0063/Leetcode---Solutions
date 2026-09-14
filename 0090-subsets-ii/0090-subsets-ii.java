class Solution {

    public static void Solve(int [] nums , int i , List<List<Integer>> ans , List<Integer>curr ){

       int n = nums.length;
       if ( i >= n){
        ans.add(new ArrayList<>(curr));
        return;
       }

       int temp = nums[i];
       curr.add(temp);
        
        // Take 
        Solve(nums , i+1 , ans , curr);

        // Skip
        curr.remove(curr.size() - 1);

        // for duplicate handle
  while ( i+1 < nums.length && nums[i] == nums[i+1]){
    i++;
  }
  // skip 
  Solve(nums , i+1 , ans ,curr);

       

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums );
       
       Solve(nums , 0 , ans ,curr);
       return ans ;
    }
}