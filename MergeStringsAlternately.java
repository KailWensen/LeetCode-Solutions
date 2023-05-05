class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String merged = "";
        int n = word1.length();
        int m = word2.length();

        for(int i =0; i<n || i<m ; i++)
        {
            if(i<n)
            merged +=word1.charAt(i);

            if(i<m)
            merged += word2.charAt(i);

        }
        return merged;
    }
}