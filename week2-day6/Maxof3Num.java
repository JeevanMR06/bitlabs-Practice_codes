//2. WAP to find maximum between three numbers.

import java.util.Scanner;
public class Maxof3Num
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int a,b,c;
  System.out.println("enter the value of a");
  a = sc.nextInt();
   System.out.println("enter the value of b");
  b = sc.nextInt();
  System.out.println("enter the value of c");
  c = sc.nextInt();
  if(a>b&&a>c)
  {
    System.out.println("a is greater and the value is  " + a);
  }
  else if(b>c)
  {
    System.out.println("b is greater and the value is " + b);
  }
  
  else 
  {
    System.out.println("c is greater and the value is" + c);
  }
}
}