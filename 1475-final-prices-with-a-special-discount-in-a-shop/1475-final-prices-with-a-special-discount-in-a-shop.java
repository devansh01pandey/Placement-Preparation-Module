class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        Stack<Integer> st =new Stack<>();
        
        for(int i =prices.length-1;i>=0;i--)
        {
            if(st.empty())
                arr[i] = prices[i];
            else if(!st.empty() && st.peek() <= prices[i])
                arr[i] = prices[i] - st.peek();
            else if(!st.empty() && st.peek() > prices[i])
            {
                while(!st.empty() && st.peek() > prices[i])
                    st.pop();
                if(st.empty())
                    arr[i] = prices[i];
                else
                    arr[i] = prices[i] - st.peek();
            }
            st.push(prices[i]);
        }
        return arr;
        
    }
}