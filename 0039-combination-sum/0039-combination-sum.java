class Solution {

public void Solve(int [] candidates , int target , int currSum , int i ,  List<List<Integer>> ans ,   List<Integer> curr  ){

    if (currSum == target ){
        ans.add(new ArrayList<>(curr));
        return ;
    }

    if (i >= candidates.length  || currSum > target ) {
        return ;
    }

    // take 
    curr.add(candidates[i]);

    Solve(candidates , target , currSum + candidates[i] , i , ans ,curr);

    // 
    curr.remove(curr.size() - 1);

    // skip

    Solve(candidates , target , currSum , i+1 , ans , curr );

}




    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();


       Solve(candidates , target , 0 , 0 , ans , curr );

              
       return ans ; 
    }
}