/*write a java program that reads a integer. you need to display a menu
 
   1. checking whether number is odd
   2. checking whether number is even
   3. checking whether number is prime
   4. checking whether number is perfect
   5. quit*/
import java.util.Scanner;
public class DisplayMeanumain
  {
    public static void main(String[] args)
    {
      int num;
      Prime p = new Prime();
      Even e = new Even();
      Odd o = new Odd();
      Perfect pe = new Perfect();
      Scanner sc = new Scanner(System.in);
      System.out.println("menu");
      System.out.println("select the operation :-\n 1. check for prime\n 2. check for even\n 3. check for odd\n 4. check for perfect\n 5. quit");
      System.out.println("enter your choise");
     int choise = sc.nextInt();
      switch(choise)
        {
          case 1 :System.out.println("enter the number");
           num = sc.nextInt();
              boolean a = p.isPrime(num);
            if(a==true)
            System.out.println("it is Prime number");
            else
              System.out.println("it is not Prime number");
              
            break;
          case 2 :
            System.out.println("enter the number");
           num = sc.nextInt();
            boolean b = e.isEven(num);
            if(b==true)
            System.out.println("it is Even number");
            else    
               System.out.println("it is not Even number");
            break;
          case 3 :
            System.out.println("enter the number");
           num = sc.nextInt();
            boolean c = o.isOdd(num);
            if(c==true)
            System.out.println("it is Odd number");
            else    
              System.out.println("it is not Odd number");
            break;
          case 4 :
            System.out.println("enter the number");
           num = sc.nextInt();
            boolean d = pe.isPerfect(num);
            if(d==true)
            System.out.println("it is Perfect number");
            else    
               System.out.println("it is not Perfect number");
            break;
          case 5 :
            System.out.println("exit");
            
        }
     }
  }
class Prime
{
  public boolean isPrime(int number)
  {
    int i,nf;
    for(i=1,nf=0;i<=number;i++)
      {
        if(number%i==0)
          nf = nf+1;
      }
    if(nf==2)
      return true;
    else
      return false;
  }
}
class Even
  {
  public boolean isEven(int number)
  {
    if (number % 2 == 0)
      return true;
    else
      return false;
  }
}
class Odd
{
  public boolean isOdd(int number)
  {
    if(number % 2!=0)
      return true;
    else
      return false;
  }
}
class Perfect
{
  public boolean isPerfect(int number)
  {
    int sum = 0,i;
    for(i=1;i<=number;i++){
      if(number%i==0){
        sum = sum +i;
      }
    }
    if(sum==number)
      return true;
      else 
      return false;
  }
}
