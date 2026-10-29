class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int req=temperatures[i];
            for(int j=i+1;j<temperatures.length;j++){
                    if(temperatures[j]>req){
                        arr[i]=j-i;
                        break;
                    }
            }
        }
        return arr;
    }
}
