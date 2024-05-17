import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        System.out.println();
        int[] a = new int[n];
//        ImportArray(a,n);
        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
//        showArray(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

//        ArangeMax:
        int max;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[i] < a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
        }

        System.out.println("K langest element in array: ");
//        showKMax(a);
        int k = new Scanner(System.in).nextInt();

        System.out.println("Array after arrange:");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }

//    public static void ImportArray(int[] a, int n){
//        System.out.println("Enter array: ");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//    }
//
//    public static void showArray(int[] a){
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//
//    public static void arrangeMax(int[] a){
//
//
//        int max =a[0];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    a[i] = max;
//                    a[j] = a[i];
//                    max = a[i];
//                }
//            }
//        }
//    }
//
//    public static void showKMax(int[] a){
//        arrangeMax(a);
//        int k = new Scanner(System.in).nextInt();
//        for (int i = 0; i < k; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
}


