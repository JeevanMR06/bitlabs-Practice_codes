import java.util.Scanner;

public class Linear_Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int num = sc.nextInt();
    int[] len = new int[num];

    System.out.println("Enter the array elements: ");
    for (int i = 0; i < num; i++) {
      len[i] = sc.nextInt();
    }

    System.out.println("Enter the element to search :");
    int search = sc.nextInt();
    int count = 0;
    for (int i = 0; i < num; i++) {
      if (search == len[i]) {
        System.out.println("The Searched element is in the index: " + i);
        count++;
        break;
      }
    }
    if (count == 0) {
      System.out.println("The Searched element is not found");
    }
  }
}