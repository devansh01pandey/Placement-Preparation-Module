// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int xor1;
        int set_bit_no;
        
        // int res = 0;
        int x= 0;
        int y= 0;
        
        xor1 = arr[0];
        for(int i =1;i<n;i++)
            xor1 = xor1 ^ arr[i];
        for(int i=1;i<=n;i++)
            xor1 = xor1 ^ i;
            
        set_bit_no = xor1 &(~(xor1-1));
        
        for(int i =0;i<n;i++)
        {
            if((arr[i] & set_bit_no)!=0)
                x = x ^ arr[i];
            else
                y = y^ arr[i];
        }
        for(int i =1;i<=n;i++)
        {
            if((i & set_bit_no)!=0)
                x = x ^ i;
            else
                y = y ^ i;
        }
        
            
	   int count=0;
       for(int i=0; i<n; i++){
           if(y == arr[i])
           count++;
       }
       if(count != 2){
           int temp = x;
           x=y;
           y=temp;
       }
       return new int[]{y,x};
        
        
    }
}