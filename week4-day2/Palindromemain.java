// 29 .WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Palindromemain
  {
    public static void main(String[] args)
    {
      Palindrom p = new Palindrom();
      p.palindrom();
    }
  }
class Palindrom
  {
    public void palindrom()
    { int digit,rev =0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();//121
     int temp =num;
      while(num!=0)
        {
          digit = num%10;//1
          num = num/10;//12
         rev = rev*10+digit;//0*10+1=1
        }
     if(temp==rev)
     {
       System.out.println("it is palindrom");
     }
     else 
     {
        System.out.println("it is not palindrom");
     }
      
    }
  }