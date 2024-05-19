import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentents = sc.nextLine();
        int count = 0;
        for (int i = (sentents.length()-1); i >= 0; i--) {
            if (sentents.charAt(i) == ' ') {
                if (count >0)
                    break;
            } else {
                count +=1;
            }
        }
        System.out.println("The last word  with length: " + count);
    }
}
