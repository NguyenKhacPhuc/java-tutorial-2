public class Assignment4 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};

        int count = 1;
        int max = 0;
        int a = 0;

        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] == arr[i + 1] - 1) {
                count += 1;
                a = count;
                if (max < a) {
                    max = a;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("Size of longest increasing continuous subsequence: " + max);
    }
}
