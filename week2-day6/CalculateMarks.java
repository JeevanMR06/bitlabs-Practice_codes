/* WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade  F*/
import java.util.Scanner;
public class CalculateMarks
{
    public static void main(String args[])
    {
      int physics,chemistry,biology,mathematics,computer,total_marks;
      float percentage;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the marks of physics");
      physics = sc.nextInt();
      System.out.println("enter the marks of chemistry");
      chemistry= sc.nextInt();
      System.out.println("enter the marks of biology");
      biology = sc.nextInt();
      System.out.println("enter the marks of mathematics");
      mathematics = sc.nextInt();
      System.out.println("enter the marks of computer");
      computer = sc.nextInt();
       System.out.println("enter the total_marks");
      total_marks = sc.nextInt();
      percentage  = ((physics+chemistry+biology+mathematics+computer)*100)/total_marks;
      if(percentage>=90)
      {
        System.out.println("grade A"+percentage);
      }
     else if(percentage>=80)
      {
        System.out.println("grade B"+percentage);
      }
      else if(percentage>=70)
      {
        System.out.println("grade C"+percentage);
      }
      else if(percentage>=60)
      {
        System.out.println("grade D"+percentage);
      }
      else if(percentage>=40)
      {
        System.out.println("grade E"+percentage);
      }
      else if(percentage<40)
      {
        System.out.println("grade F"+percentage);
      }
    }
}