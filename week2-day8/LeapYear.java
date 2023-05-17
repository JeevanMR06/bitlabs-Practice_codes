// Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.

import java.util.Scanner;
public class LeapYear
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int year,leap_year;
      System.out.println("enter the year");
      year = sc.nextInt();
      leap_year = ((year%4==0)&&(year%100!=0)||(year%400==0))?0:1;
      switch(leap_year)
            {
        case 0:
          System.out.println("it is leap year");
        break;
              case 1:
          System.out.println("it is not a leap year");
              break;
          
            }
    }
  }