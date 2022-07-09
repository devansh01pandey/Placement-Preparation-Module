class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        // int res = 0;
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        for(int num: map.keySet())
        {
            if(map.get(num) > (nums.length/3))
                ans.add(num);
        }
        
        return ans;
        
    }
}