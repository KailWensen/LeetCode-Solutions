class Solution {
    public int[] decompressRLElist(int[] nums) 
   {
        int size = 0, k = 0;
        for(int i=0;i<nums.length;i+=2)
            size += nums[i];
        int[] tmp = new int[size];
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
                tmp[k++] = nums[i+1];
        }
        return tmp;
    }
}