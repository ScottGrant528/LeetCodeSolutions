class Solution {
    public boolean isPalindrome(int x) {
        //If the answer is a negative it cannot be true
        if (x < 0){
            return false; 
        }

        int reversed = 0; //stores the number when reversed
        int temp = x; //used in the reversing process

        while(temp != 0){
            int digit = (int) (temp % 10); //extract the last digit
            reversed = reversed * 10 + digit; //multiple current value of reversed by 10 and add the extracted digit to reverse
            temp /= 10; //remove last digit and move on in the next loop
        }

        return (reversed == x); //return result
    }
}