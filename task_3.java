import java.util.*;
public class task_3 {
    
    public static void main (String[] args)
    {
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a line: ");
    String line = scanner.nextLine();

    String[] words = line.split(" ");

    for (int i = words.length - 1; i >= 0; i--)
    {    
         System.out.print(words[i] + " ");
    }
    
    
}

    
}