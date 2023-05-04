class Solution {
    public int removeElement(int[] arr, int val) 
    {   
          int n = arr.length;
    
 
        int[] temp = new int[n];
 
        int j = 0;
        for (int i = 0; i < n ; i++)
     {       if (arr[i] != val)
                temp[j++] = arr[i];
            else 
            continue;
    }
 
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
        
    }
}