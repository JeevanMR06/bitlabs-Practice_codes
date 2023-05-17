//write a java program to check whether a character is digit or not
import java.util.Scanner;
public class CharDigitOrNot
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      char a;
      System.out.println("enter the digit");
      a = sc.nextLine().charAt(0);
      if(a>='0' &&a<='9')
      {
        System.out.println("it is digit");
      }
      else
      {
         System.out.println("it is not digit");
      }
    }
  }