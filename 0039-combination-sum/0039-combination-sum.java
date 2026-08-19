class Solution {

public void Solve(int [] candidates , int target , int currSum , int start ,  List<List<Integer>> ans ,   List<Integer> curr  ){

    // repalce i wiht start index for 2nd approach 

    // if (currSum == target ){
    //     ans.add(new ArrayList<>(curr));
    //     return ;
    // }

    // if (i >= candidates.length  || currSum > target ) {
    //     return ;
    // }

    // // take 
    // curr.add(candidates[i]);

    // Solve(candidates , target , currSum + candidates[i] , i , ans ,curr);

    // // 
    // curr.remove(curr.size() - 1);

    // // skip

    // Solve(candidates , target , currSum , i+1 , ans , curr );


      // 2nd approach 

      if(currSum == target ){
        ans.add(new ArrayList<>(curr));
        return ;
      }  

      if(currSum > target ) return ;
    
      for (int i = start ; i< candidates.length ; i++){
        curr.add(candidates[i]);
        Solve(candidates , target , currSum + candidates[i] , i , ans , curr);
        curr.remove(curr.size() - 1);
      }
}




    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();


        Solve(candidates , target , 0 , 0 , ans , curr );

              
        return ans ; 

    
    }
}