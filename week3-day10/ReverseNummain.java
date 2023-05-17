//WAP to enter a number and print its reverse.
import java.util.Scanner;
public class ReverseNummain
  {
    public static void main(String[] args)
    {
      ReverseNum r = new ReverseNum();
      r.reversenum();
    }
  }
class ReverseNum
  {
    public void reversenum()
    { int rev =0,digit;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      do
        {
          digit = num%10;
          rev = (rev*10)+digit;
          num = num/10;
        }while(num>0);
     System.out.print("reverse number is :"+ rev);
      
    }
  }