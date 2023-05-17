//WAP to calculate product of digits of a number.
import java.util.Scanner;
public class ProductOfDigitmain
  {
    public static void main(String[] args)
    {
      ProductOfDigit p = new ProductOfDigit();
      p.productofdigit();
      
    }
  }
class ProductOfDigit
  {
    public void productofdigit()
    {
      int digit,product=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the digit");
      int num = sc.nextInt();
      do
      {
        digit = num%10;
        product = product*digit;
        num = num/10;
        
      }while(num!=0);
        System.out.println("product of digits of a number:"+ product);
    }
  }