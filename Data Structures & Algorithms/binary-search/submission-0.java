class Solution {
    public int search(int[] nums, int target) {
      int left=0;
      int n=nums.length;
      int right=n-1;
      int mid=0;
      while(left<=right){
        mid=(left+right)/2;
        if(target>nums[mid]){
            left++;
        }
        else if(target==nums[mid]){
            return mid;
        }
        else right--;
      }  
      return -1;
    }
}
