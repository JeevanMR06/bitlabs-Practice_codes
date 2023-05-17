// assume that there are 500,200 and 100 notes are there in the ATM. write a java program to find the minimum number of notes to be dispensed for the requested amount using conditionals only . do not use loops
import java.util.Scanner;
public class AtmMoneyMain
  {
    public static void main(String[] args)
    {
      AtmMoney at = new AtmMoney();
      at.atmMoney();
    }
  }

class AtmMoney
  {
      public void atmMoney()
  {
      Scanner sc = new Scanner(System.in);
    int amount,notes,min_notes=0;
    System.out.println("enter the amount");
    amount = sc.nextInt();
    if(amount%100==0)
    {
      if(amount>=500)
      {
        notes=amount/500;
         min_notes = min_notes+notes;
         amount = amount%500;
      }
      if(amount>=200)
      {
        notes = amount/200;
         min_notes = min_notes+notes;
         amount = amount%200;
      }
      if(amount>=100)
      {
        notes = amount/100;
        min_notes = min_notes+notes;
        amount = amount%100;
      }
      System.out.println("minimum number of notes is"+ min_notes);
    }
else 
    {
      System.out.println("amount will be in 100s only");
    }
}
  }
