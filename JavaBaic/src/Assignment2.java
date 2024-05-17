public class Assignment2 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowArr = arr.length;//2
        int colArr = arr[0].length;//3
        int[][] arr2 = new int[colArr][rowArr];
        for (int i = 0; i < rowArr; i++) {
            for (int j = 0; j < colArr; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr2.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
