import java.util.Scanner;
public class Weekday
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int week_day;
  System.out.println("Enter the week_day number");
  week_day = sc.nextInt();
  switch(week_day)
    {
      case 1:
        System.out.println("sunday");
        break;
        case 2:
        System.out.println("monday");
        break;
        case 3:
        System.out.println("tueday");
        break;
        case 4:
        System.out.println("wedday");
        break;
        case 5:
        System.out.println("thurday");
        break;
        case 6:
        System.out.println("friday");
        break;
        case 7:
        System.out.println("satday");
        break;
    }
}
}