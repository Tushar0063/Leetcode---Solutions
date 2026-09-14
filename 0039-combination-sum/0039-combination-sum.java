class Solution {

    public void Solve(int [] candidates , int target , int i ,List<List<Integer>> ans,List<Integer> curr ,int currSum ){
  int n = candidates.length;

  if (currSum == target){
    ans.add(new ArrayList<>(curr));
    return ;
  }
  if (currSum > target) return ;

for (int j = i; j < candidates.length ; j++){

  // Take 
  curr.add(candidates[j]);
  Solve(candidates , target , j , ans , curr, currSum + candidates[j]);

  // skip 
  curr.remove(curr.size() - 1);
}


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {


     List<List<Integer>> ans =  new ArrayList<>();
     List<Integer> curr = new ArrayList<>();

     Solve(candidates , target , 0 , ans , curr , 0);
     return ans ;

    }
}