import java.util.Scanner;
public class task_5 {
    public static void main (String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Input number a,b,c,d,e,f");
        
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();
        System.out.println("Input d: ");
        double d = scanner.nextDouble();
        System.out.println("Input e: ");
        double e = scanner.nextDouble();
        System.out.println("Input f: ");
        double f = scanner.nextDouble();

         double mau = a*e - d*b;

         double y = 0;
         double x = 0;

         if(mau == 0)
         {
             System.out.println("No result ");
         }
         else
         {
            x += (c*e -b*f)/mau;
            y += (a*f -d*c)/mau; 
         }

         System.out.printf("%.3f %.3f",x, y);
    }

}
