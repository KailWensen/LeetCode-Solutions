/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) 
        {
            int low=1,high=n,mid;
            int ans=-1;
            while(low<=high)
            {
                mid = low + ((high - low)/2 );
                if(isBadVersion(mid)) //just because the mid element is bad does not mean it is the first bad element so save the mid position and shift the high to right.
                {
                    high=mid-1;
                    ans=mid;
                }
                else
                    low=mid+1;
            }
            return ans;
        }
    }