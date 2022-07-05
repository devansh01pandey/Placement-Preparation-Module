class Solution {
    public void sortColors(int[] nums) {
        var low = 0;
        var mid=0;
        var high = nums.length-1;
        int temp;
        
        while(mid <= high) {
            switch(nums[mid]) {
                case 0 :{
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
                
        }
        
        
        
// DUTCH NATIONAL FLAG ALGO.                
//         var low = 0;
//         var mid = 0;
//         var high = nums.length-1;
        
//         while(mid<=high)
//         {
//             if(nums[mid] == 0)
//             {
//                 swap(nums,mid,low);
//                 low++;
//                 mid++;
//             }
//             else if (nums[mid] == 1)
//             {
//                 mid++;
//             }
//             else
//             {
//                 swap(nums,mid,high);
//                 high--;
//             }
//         }
        
//     }
    
//     private static void swap(int arr[],int first,int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }

}
}