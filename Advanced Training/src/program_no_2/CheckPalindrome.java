package program_no_2;

import java.util.Scanner;
 
public class CheckPalindrome
{
   public static void main(String args[])
   {
      String str = null, rev = "";
     
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
      String str1 = str.toUpperCase();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str1+" is a palindrome");
      else
         System.out.println(str1+" is not a palindrome");
 
   }
}