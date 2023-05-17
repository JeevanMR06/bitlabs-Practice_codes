import java.util.Scanner;
public class RockPaperSeissor {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter player_1 move");
    System.out.println("1.Rock 2.Paper 3.Scissors");
    int player_1=sc.nextInt();
    System.out.println("Enter player_2 move");
    System.out.println("1.Rock 2.Paper 3.Scissors");
    int player_2=sc.nextInt();
    if((player_1==1 && player_2==3)||(player_1==2 && player_2==1)||(player_1==3 && player_2==2))
    {
      System.out.println("Player_1 wins");
    }
    else if((player_2==1 && player_1==3)||(player_2==2 && player_1==1)||(player_2==3 && player_1==2))
    {
      System.out.println("Player_2 wins");
    }
    else if((player_1==1&&player_2==1)||(player_1==2&&player_2==2)||(player_1==3&&player_2==3))
    {
      System.out.println("tie");
    }
       else {
         System.out.println("select correct move");
       }
    }
  }