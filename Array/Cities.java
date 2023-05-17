//Program to enter 5 cities names using Arrays

import java.util.Scanner;

public class Cities {
  public static void main(String[] args) {
    Cities_1 call = new Cities_1();
    call.name();

  }
}

class Cities_1 {
  public void name() {
    String[] city = new String[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < city.length; i++) {
      System.out.print("Enter city " + (i + 1) + ":");
      city[i] = sc.nextLine();
    }

    System.out.println("Cities entered: ");
    for (int i = 0; i < city.length; i++)
      System.out.println(city[i]);
  }
}