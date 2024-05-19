import java.util.*;
public class task_8 {

    public static void main(String[] args)

    {
        int[] a = {0,1,2,4,5,7};
        System.out.println( summaryRanges(a));

        int [] b = {0,2,3,4,6,8,9};
        System.out.println( summaryRanges(b));

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        
        if (nums.length < 1) {
            return res;
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    res.add(start + "");
                } else {
                    res.add(start + "->" + end);
                }
                
                start = nums[i];
                end = nums[i];
            }
        }
        
        if (start == end) {
            res.add(start + "");
        } else {
            res.add(start + "->" + end);
        }
        
        return res;
    }
    
}