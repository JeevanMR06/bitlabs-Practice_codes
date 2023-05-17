/*Write a Java program that prompts the user to enter their weight in kilograms and height in meters, and calculates their body mass index (BMI) using conditional statements and you need to print underweight,healthy ,overweight and obessity according to the following
    bmi <18                underweight
    bmi >=18 and bmi<25    healthy
    bmi>=25 and bmi<30     overweight
    bmi>=30                obessity*/
  import java .util.Scanner;
public class BmiMain
  {
    public static void main(String[] args)
    {
      Bmi b = new Bmi();
      b.bmi();
    }
  }
      
      
     class Bmi
       {
         public void bmi()
         {
       
      
      Scanner sc = new Scanner(System.in);
      double weight,height;
      System.out.println("enter the weight in kg");
      weight = sc.nextDouble();
      System.out.println("enter the height in meters");
      height = sc.nextDouble();
       double bmi = (weight/(height*height));
      if(bmi<18)
      {
        System.out.println("underweight and the bmi is"+bmi );
      }
      else if(bmi<25)
      {
        System.out.println("healthy bmi is"+bmi);
      }
      else if(bmi<30)
      {
        System.out.println("overweight bmi is"+bmi);
      }
      else if(bmi>=30)
      {
        System.out.println("obessity and the bmi is"+bmi);
      }
      
      
    }
  }
