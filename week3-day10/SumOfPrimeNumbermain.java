//write a java program to find sum of all prime numbers from 1 to n
import java.util.Scanner;
public class SumOfPrimeNumbermain
  {
    public static void main(String[] args)
    {
      PrimeNum pc = new PrimeNum();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
        int number= sc.nextInt();
       
      for(i=1,sum =0;i<number;i++)
        {
          boolean b = pc.isPrime(i);
      if(b)
      {
        sum = sum+i;
      }
        System.out.println("sum of Prime number is :"+ sum);
         
        }
    }
      
    }
  
class PrimeNum
  { 
    public boolean isPrime(int number)
    {
     int i,nf;
    for(i=1,nf=0;i<=number;i++)
      {
        if(number%i==0)
          nf++;
      }
    if(nf==2)
      return true;
    else
      return false;
    }
  }