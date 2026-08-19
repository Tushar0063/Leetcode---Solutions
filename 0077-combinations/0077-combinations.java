class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // List<List<Integer>> result = new ArrayList<>();
        // generateCombinations(1, n, k, new ArrayList<Integer>(), result);
        // return result;

                
                List<List<Integer>> ans = new ArrayList<>();
                List<Integer> curr = new ArrayList<>();

                generateCombinations ( 1 ,  n ,  k ,  curr, ans);

                return ans ;

    }

    public  void generateCombinations(int start, int n, int k, List<Integer> curr , List<List<Integer>> ans ) {
        // if (k == 0) {
        //     result.add(new ArrayList<>(combination));
        //     return;
        // }
        // for (int i = start; i <= n - k + 1; i++) {
        //     combination.add(i);
        //     generateCombinations(i + 1, n, k - 1, combination, result);
        //     combination.remove(combination.size() - 1);
        // }


         if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return ;
         }
                
                for(int i = start ; i<= n ;i++){
                    curr.add(i);
                     generateCombinations(i+1 ,n , k ,curr , ans );
                     curr.remove(curr.size() - 1);
                }

    }
}