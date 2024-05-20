import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

    public static void main(String[] args) {
        int[] nums1 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums2 = {0, 2, 3, 4, 5, 7};

        printSummaryRanges(nums1);
        System.out.println();
        printSummaryRanges(nums2);

    }

    private static void printSummaryRanges(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = i;
            while (i < nums.length - 1 && nums[i + 1] == (nums[i] + 1)) {
                i++;
            }

            int b = i;
            if (a != b)
                System.out.println(nums[a] + "->" + nums[b]);
            else {
                System.out.println(nums[i]);
            }
        }
    }
}
