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
        // code here
         int xor=arr[0], x=0, y=0;
        for(int i=1; i<n; i++)
        xor^=arr[i];
        for(int i=1; i<=n; i++)
        xor^=i;
        //get the rightmost bit in set_bit_no.
       int set_bit_no = xor & ~(xor-1);
       for(int i=0; i<n; i++){
       if((arr[i] & set_bit_no) != 0)
       x^=arr[i];
       else
       y^=arr[i];
       }
       for(int i=1; i<=n; i++){
       if((set_bit_no & i) != 0 )
       x^=i;
       else
       y^=i;
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