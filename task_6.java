import java.util.Scanner;
public class task_6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a wordline\n");
        String line = scanner.nextLine();
        
        if (line == null || line.isEmpty()) {
            System.out.println("Null");
        } else {
            String[] words = line.split("\\s+");            
            System.out.println("The last word is "+words[words.length-1]+ 
            " with length " + words[words.length -1].length());
        }
    
    }
}
