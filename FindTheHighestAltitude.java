class Solution {
    public int largestAltitude(int[] gain) 
    {
        int highest= Integer.MIN_VALUE;
        int sum = 0;

        for(int i =0; i< gain.length; i++)
        {
            sum +=gain[i];
            if(highest<sum)
                highest = sum;
            if(highest<0)
                highest = 0;
            
        }

        return highest;

        
    }
}
