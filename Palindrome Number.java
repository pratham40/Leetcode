class Solution {
    public boolean isPalindrome(int no) {
        int reverse=0;
        int temp=no;
        if(no<0){
            return false;
        }
        else {
            while (temp>0){
                reverse=reverse*10+temp%10;
                temp/=10;
            }
        }
        return reverse==no;
    }
}
