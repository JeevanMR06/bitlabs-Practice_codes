//WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
public class NaturalNumRev
  {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("enter the num");
     num = sc.nextInt();
   while(num>=1)
     {
       System.out.println(num);
       num--;
     }
  }
  }