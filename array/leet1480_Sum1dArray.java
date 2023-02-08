// 22.02.09 - Leet1408 - Running Sum of 1d Array
// [n1, n1+n2, n1+n2+n3, n1+...+ni]

class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        
        int[] output = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) 
        {
            sum += nums[i];
            output[i] = sum;
        }

        return output;
    }
}
