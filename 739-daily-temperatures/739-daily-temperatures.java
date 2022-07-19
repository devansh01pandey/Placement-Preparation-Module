class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] span = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1; i>=0;i--)
        {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
                st.pop();
            // if(st.size() == 0)
            //     span[i] = 0;
            if(!st.isEmpty())
                span[i] = st.peek()-i;
            st.push(i);
        }
        return span;
        
    }
}