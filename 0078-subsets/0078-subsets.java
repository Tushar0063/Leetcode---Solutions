class Solution {

public void Solve(int [] nums , int i ,  List<List<Integer>> ans,   List<Integer> curr){

    int n = nums.length;
    if (i >= n){
        ans.add(new ArrayList<>(curr));
        return ;
    }

    int temp = nums[i];
    curr.add(temp);

    // take 
    Solve(nums , i+1 , ans ,  curr);

    // skip 
    curr.remove(curr.size() - 1);
    Solve(nums , i+1 , ans , curr);


}

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
           

           Solve(nums , 0 ,  ans ,  curr);
           return ans;

        
    }
}