import java.util.*;
public class task_4 {
    public static void main(String[] args)
    {

        int[] nums = {10,11,12,13,147,8,9,1,2,3};
        System.out.println(longestIncreasing(nums)); 
        longestIncreasing(nums);
    }

    public static int longestIncreasing(int[] nums)
    {
          int maxLength = 1;
          int countLength= 1;

          for(int i=1; i < nums.length;i++)
          {
             if(nums[i] > nums[ i - 1])
             {
                countLength++;
             }
             else{
                if(countLength>maxLength)
                {
                    maxLength = countLength;
                }
                countLength = 1;
             }
          }
          return maxLength;
    }
}
