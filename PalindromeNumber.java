class Solution {
    public:
        bool isPalindrome(int x) 
        {
            if (x < 0) 
            {
                return false;
            }
            // Store the number in a variable
            int number = x;
            // This will store the reverse of the number
            long reverse = 0;
            while (number > 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            return x == reverse;
        }
            
    
    };