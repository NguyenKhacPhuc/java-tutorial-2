import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        int[] myArr = new int[]{7, 1, 5, 3, 6, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of purchase of shares:");
        int buy = sc.nextInt();

        System.out.println("You bought day " + buy + " and the price for this day is: " + myArr[buy - 1]);

        System.out.println("Enter the date of sale of shares");
        int sale = sc.nextInt();

        if (myArr[sale - 1] > myArr[buy - 1]) {
            System.out.println("Profit: " + (myArr[sale - 1] - myArr[buy - 1]));
        } else {
            System.out.println("Profit: 0");
        }
    }
}
