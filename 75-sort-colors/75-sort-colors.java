class Solution {
    public void sortColors(int[] nums) {
        
        var low = 0;
        var mid = 0;
        var high = nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    
    private static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    private static void print(int nums[]) {
        for(int num : nums) 
        {
            System.out.print(nums+" ");
        }
        System.out.println();
    }
}