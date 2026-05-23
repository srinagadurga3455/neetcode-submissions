class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=0;
        int minHeight=0;
        while(left<right){
            int width=right-left;
            minHeight = Math.min(heights[left],heights[right]);
            int area = minHeight*width;
            maxArea=Math.max(area,maxArea);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxArea;
    }
}
