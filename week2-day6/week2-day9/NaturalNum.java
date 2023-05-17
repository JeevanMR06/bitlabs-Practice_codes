//WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class NaturalNum
  {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int num,i=1;
    System.out.println("enter the num");
     num = sc.nextInt();
   while(i<=num)
     {
       System.out.println(i);
       i++;
     }
  }
  }