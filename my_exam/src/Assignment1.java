import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Input k element");
        int k = sc.nextInt();
        if (k > n) {
            System.out.println("Invalid");
        } else {
            int[] myArray = new int[n];
            int mL = myArray.length;

            for (int i = 0; i < mL; i++) {
                System.out.println("Enter the value of the second element a[" + i + "]");
                myArray[i] = sc.nextInt();
            }

            System.out.println("Original Array:");
            for (int j : myArray) {
                System.out.print(j + " ");
            }

            System.out.println();
            System.out.println(k + " largest elements of the said array are:");
            Arrays.sort(myArray);
            for (int i = mL - 1; i >= (mL - k); i--) {
                    System.out.print(myArray[i] + " ");

            }


        }


    }
}
