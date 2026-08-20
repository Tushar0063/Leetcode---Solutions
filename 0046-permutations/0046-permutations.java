class Solution {

public void Solve (int [] nums ,boolean [] used , List<List<Integer>> ans ,  List<Integer> curr  ){

if (curr.size() == nums.length){
    ans.add(new ArrayList<>(curr));
    return ;
}




for(int i = 0 ; i < nums.length ; i++){

if (used[i] == true) {
    continue ;
}
else{
curr.add(nums[i]);
used[i] = true;
}
Solve(nums ,used ,  ans , curr);
curr.remove(curr.size() - 1 );
used[i] = false ;

   
}

}

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

          boolean [] used = new boolean[nums.length];

   Solve(nums ,used , ans , curr);
   return ans ;
    }
}