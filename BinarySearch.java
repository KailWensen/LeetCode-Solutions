class Solution 
{
    public int search(int[] nums, int target) 
    {
        int r = nums.length -1;
        int l = 0;

        while(l<=r)
        {
            int mid = l+(r-l)/2;

            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                l=mid+1;
            else
                r = mid-1;

        }

        return -1;
    }
}