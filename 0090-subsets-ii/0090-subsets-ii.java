class Solution {

public void Solve( List<List<Integer>> ans ,  List<Integer > curr , int [] nums , int i){

    if(i == nums.length) {
        ans.add(new ArrayList<>(curr));
        return ;
    }

    // take
    int temp = nums[i];
    curr.add(temp);
    Solve(ans , curr , nums , i+1);

    // skip 
    curr.remove(curr.size() - 1);

    while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
    Solve(ans , curr , nums , i+1);

}

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer > curr = new ArrayList<>();

               Arrays.sort(nums);
      Solve(ans , curr , nums , 0);
      return ans ;

    }
}