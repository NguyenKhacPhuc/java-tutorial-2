import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        int[] myArr = new int[]{10, 11, 12, 13, 5, 14, 1, 2, 3, 4, 5, 6, 7, 8, 2};
        System.out.println(Arrays.toString(myArr));
        int count = 1;
//        int n = 0;
        int max = 0;

        for (int i = 0; i < (myArr.length - 1); i++) {
            if (myArr[i] == myArr[i + 1] - 1) {
                count = count + 1;
//                n = count;

                if (max < count) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
