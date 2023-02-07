// 2023.02.08 - Leet01 - Two Sum

class leet01_twosum {
    // 1st approach: using two 'for' - better in terms of 'time'
    public int[] twoSum(int[] nums, int target) {
        
        int length = nums.length;

        for(int i = 0; i < length; i++) 
        {
            for(int j = i+1; j < length; j++) 
            {
                int sum = nums[i] + nums[j];

                if(sum == target) 
                {
                    int[] output = new int[]{i, j};
                    return output;
                }
            }
        }
        
        return null;
    }
  
    // 2nd approach: using one 'while' - better in terms of 'memory'
    public int[] twoSum(int[] nums, int target) {

        // pivot: index just right after index 'i'
        int i = 0;
        int pivot = i + 1;
        int length = nums.length;
        
        while(i < length) 
        {
            if(pivot >= length)
            {
                i++;
                pivot = i + 1;
            } 

            if(nums[i] + nums[pivot] == target)
            {
                return new int[]{i, pivot};
            }

            pivot++;
        }
        
        return null;
    }
}

