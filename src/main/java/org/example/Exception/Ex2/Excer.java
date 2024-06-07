package org.example.Exception.Ex2;

public class Excer {

   public static int devide(int a, int b) throws ArithmeticException {
      if (b == 0) {
         throw new ArithmeticException("Can not devide for zero");
      }
      return a / b;
   }

   public static int convertStringToInt(String s) throws NumberFormatException {
      if (s == null) {
         throw new NumberFormatException("Cannot convert this string to number");
      }

      return Integer.parseInt(s);
   }

   public static void main(String[] args) {

      int result = devide(2, 1);
      System.out.println(result);
      // int result2 = devide(2, 0);
      // System.out.println(result2);
      int result3 = convertStringToInt("12345");
      System.out.println(result3);
   }
}
