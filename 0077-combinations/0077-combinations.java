class Solution {

    public void Solve(int nums[] , int i , int k ,    List<List<Integer>> ans,  List<Integer> curr){

       
  
  if ( curr.size() == k){
    ans.add(new ArrayList<>(curr));
    return ;
  }
   if ( i >= nums.length) return;
     
     
      curr.add(nums[i]);
     
      // take 
      Solve(nums , i+1 , k , ans , curr);

      // skip 
      curr.remove(curr.size()-1);
      Solve(nums , i+1 , k , ans ,curr);



    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        int [] nums = new int [n];
        for (int i = 0 ; i< n ; i++){
            nums[i] = i+1;
        }
  Solve(nums , 0 , k , ans ,curr);
  return ans ;
    }
}