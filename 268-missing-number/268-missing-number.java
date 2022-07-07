class Solution {
    public int missingNumber(int[] nums) {
        // int res = nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     res = res ^ i;
        //     res = res ^ nums[i];
        // }
        // return res;
        
        Arrays.sort(nums);
        int left = 0,right = nums.length,mid =(left+right)/2;
        while(left<right)
        {
            mid = (left+right)/2;
            if(nums[mid]>mid)
            {
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
        
    }
}