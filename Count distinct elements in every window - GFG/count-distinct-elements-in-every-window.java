// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<k;i++)
        {
            if(map.containsKey(A[i]))
                map.put(A[i],map.get(A[i])+1);
            else
                map.put(A[i],1);
        }
        list.add(map.size());
        for(int i = 1;i<n-k+1;i++)
        {
            map.put(A[i-1],map.get(A[i-1])-1);
            if(map.get(A[i-1])==0)
                map.remove(A[i-1]);
            map.put(A[i+k-1],map.getOrDefault(A[i+k-1],0)+1);
            
            list.add(map.size());
        }
        return list;
    }
}

