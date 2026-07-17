class Solution {
    public boolean isPalindrome(int x) {
        int digit;
        int dup=x;
        int rev=0;
        while(x>0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(dup==rev){
            return true;
        }
        return false;
    }
}