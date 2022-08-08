class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        int reverse = 0,target = x;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse *10 + digit;
            x /= 10;
        }
        if(target == reverse) return true;
        else return false;
        
    }
}