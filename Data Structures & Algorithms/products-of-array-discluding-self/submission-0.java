class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr = new int[nums.length];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pro=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    pro*=nums[j];
                }
            }
            arr[i]=pro;
    }  
        return arr;
     }
}  
