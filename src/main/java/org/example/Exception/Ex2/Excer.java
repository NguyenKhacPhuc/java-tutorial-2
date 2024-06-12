package org.example.Exception.Ex2;

public class Excer {
   public static int devide(int a, int b) {
      try {
         return a / b;

      } catch (ArithmeticException e) {
         System.out.println("Can't resolved for zero");
         return 0;
      }
   }

   public static void convertStringToInt(String s) {
      try {
         System.out.println(Integer.parseInt(s));
      } catch (NumberFormatException e) {
         System.out.println("Can not parse integer");
      }
   }

   public static void main(String[] args) {
      devide(10, 2);
      devide(10, 0);
      convertStringToInt("123asd");
      convertStringToInt("12345");
   }
}
