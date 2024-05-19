import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[]{7,6,4,3,1};
        int buyDay;
        int sellDay;

        do {
            System.out.println("Enter buy day: ");
            buyDay = sc.nextInt();
            System.out.println("Enter sell day: ");
            sellDay = sc.nextInt();
            if (buyDay > sellDay) {
                System.out.println("Enter again. Warning buyDay < sellDay");
            }
        } while (buyDay > sellDay);


        int profit = 0;
        if (prices[sellDay-1] > prices[buyDay-1]) {
            profit = prices[sellDay-1] - prices[buyDay-1];
            System.out.println("Maximum profit:" + profit);
        } else {
            System.out.println(profit);
        }

    }

}
