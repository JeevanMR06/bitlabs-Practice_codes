//3. WAP to check whether a number is negative, positive or zero.
import java.util.Scanner;
public class CheckPosOrNeg
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int a;
  System.out.println("enter the value of a");
  a = sc.nextInt();
   if(a>0)
   {
     System.out.println("a is positive and the value is " + a);
   }
  else if(a<0)
  {
     System.out.println("a is negative and the value is " + a);
  }
    
 else 
  {
    System.out.println("a is equalto 0 and the value is " + a);
  }
}
}