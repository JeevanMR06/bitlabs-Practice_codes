//write a java program to check whether a positive integer is prime or not 
import java.util.Scanner;
public class PrimeNummain
  {
    public static void main(String[] args)
    {
      PrimeNum pc = new PrimeNum();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
        int number= sc.nextInt();
        boolean b = pc.isPrime(number);
      if(b)
        System.out.println("it is Prime number");
          else 
         System.out.println("it is not a Prime number");
        
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