class Solution {

public void Solve (int [] candidates  , int i , int target , int currSum ,List<List<Integer>> ans,List<Integer> curr ){

    if(currSum == target) {
        ans.add(new ArrayList<>(curr));
        return ;
    }
    if (currSum > target || i >= candidates.length ){
        return ;
    }

    // int temp = candidates[i];
    curr.add(candidates[i]);
    Solve(candidates , i+1 , target  , currSum + candidates[i] , ans , curr);

    curr.remove(curr.size() - 1);
    // handle duplicates 
    while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
        i++;
    }

    // skip 
    Solve(candidates , i+1 , target , currSum , ans , curr);
}

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
List<List<Integer>> ans = new ArrayList<>();
List<Integer> curr = new ArrayList<>();

Arrays.sort(candidates);

Solve(candidates , 0 , target , 0 , ans , curr);
return ans ;
    }
}