class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int m = s.length();
        int n = t.length();

        HashMap<Character, Character> map = new HashMap<>();
        char c = 'a';
        if(m!=n)
            return false;

        else
        {
            for(int i = 0; i<m; i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    c= map.get(s.charAt(i));
                    if(c!=t.charAt(i))
                        return false;
                }
                else if(!map.containsValue(t.charAt(i)))
                {
                    map.put(s.charAt(i), t.charAt(i));
                }
                else
                    return false;
            }

        }        
            return true;
    }
}