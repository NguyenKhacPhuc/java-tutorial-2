import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String:");
        String str = sc.nextLine();
        System.out.println(str);
        String[] parts = str.split(" ");
        int Mylength = parts.length;

        System.out.println("The last word is " + parts[Mylength - 1] + " with " + parts[Mylength - 1].length());
    }
}
