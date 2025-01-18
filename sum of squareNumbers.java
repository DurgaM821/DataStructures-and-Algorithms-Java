
// leetcode: https://leetcode.com/problems/sum-of-square-numbers/
/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
*/
class Solution {
    public boolean judgeSquareSum(int c) {
        // two pointer approach

        // here we are going to increase the ptr value

    long left=0, right=(long)Math.sqrt(c);
    
     while(left<=right){
        long curr=(left*left)+(right*right);
        if(curr>c){
            right--;
        }
        else{
            if(curr<c){
                left++;
            }
            else{
            return true;
        }
        }

        

    }
    return false;
    }
}
