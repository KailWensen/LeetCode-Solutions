class Solution {
    public int maxProfit(int[] prices) 
    {
        int buyprice = prices[0]; 
        int result = 0;

        for(int i=1; i<prices.length; i++)
        {
            int sellprice = prices[i];
            if(buyprice>prices[i])
                buyprice = prices[i];
            else if(result<sellprice - buyprice)
            {
                result = sellprice - buyprice;
            }
        }

        return result;
        
    }

}