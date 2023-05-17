//Create an java application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
import java.util.Scanner;
public class Temperature
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      char ch;
      float temperature;
      System.out.println("enter Celsius or Fahrenheit");
      ch = sc.next().charAt(0);
      if((ch== 'f')||(ch== 'F'))
      {
       System.out.println("enter the temperature");
        temperature = sc.nextFloat();
        System.out.println("temperature in celsius is"+((temperature-32)/1.8));
      }
      else if((ch== 'c')||(ch== 'C'))
      {
        System.out.println("enter the temperature");
        temperature = sc.nextFloat();
        System.out.println("temperature in fahrenheit is"+((temperature*1.8)+32));
      }
      else 
      {
        System.out.println("input is invalid");
      } 
    }
  }