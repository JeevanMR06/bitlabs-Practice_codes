//Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class BirthDate
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the birthdate");
       String birthdateString = sc.nextLine();
      LocalDate birthdateLocalDate = LocalDate.parse(birthdateString);
      LocalDate currentDate = LocalDate.now();
      Period age = Period.between(birthdateLocalDate, currentDate);
      System.out.println("Year-"+age.getYears()+"Months-"+age.getMonths()+"Days-"+age.getDays());
    if(age.getYears()>=18)
    {
      System.out.println("Adult");
    }
    else{
      System.out.println("Minor");
    }
      
    }
  }