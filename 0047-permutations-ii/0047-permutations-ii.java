class Solution {

public void Solve(int [] nums , boolean [] used , List<List<Integer>>  ans , List<Integer > curr){

    if (curr.size() == nums.length){
        ans.add(new ArrayList<>(curr));
        return;
    }

    for(int i = 0 ; i<nums.length ; i++){
          

        if (used[i] == true ) continue ;
         if (i > 0 && nums[i] == nums[i-1] && used[i-1] == false){
           continue;}
        
   curr.add(nums[i]); 
   used[i] = true;

   Solve (nums , used , ans , curr);
 
 curr.remove(curr.size() - 1);
          used[i] = false ;
         }
     
//   if (i > 0 && nums[i] == nums[i-1] && used[i-1] == false){
// i++;
//         }
    
}

    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> curr =  new ArrayList<>();


     boolean [] used = new boolean [nums.length];
     Arrays.sort(nums);
     Solve(nums , used , ans , curr);

        return ans ;
    }
}