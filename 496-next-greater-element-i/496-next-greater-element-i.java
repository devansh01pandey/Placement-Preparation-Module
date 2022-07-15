class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer,Integer> greatest = new HashMap<Integer,Integer>();
//         We will traverse from back
        for(int i = nums2.length-1;i>=0;i--)
        {
            if(st.isEmpty())
                greatest.put(nums2[i] , -1);
            else if(st.isEmpty() == false && st.peek() > nums2[i])
            {              
                greatest.put(nums2[i] , st.peek());
            }
            
            else if(!st.empty() && st.peek() <= nums2[i])
            {
                while(!st.empty() && st.peek() <= nums2[i])
                {
                    st.pop();
                }
                if(st.empty())
                    greatest.put(nums2[i] , -1);
                else
                {
                    greatest.put(nums2[i],st.peek());
                }
            }
            st.push(nums2[i]);     
        }
        
        int res[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++)
        {
            res[i] = greatest.get(nums1[i]);
        }
        return res;
        
        
    }
}