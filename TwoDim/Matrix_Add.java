import java.util.Scanner;
public class Matrix_Add{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row size: ");
    int row=sc.nextInt();
    System.out.println("Enter Column size: ");
    int col=sc.nextInt();
    int arr1[][]=new int[row][col];
    System.out.println("enter the number of rows for B matrix");
    int low=sc.nextInt();
    System.out.println("enter the number of  columns for B matrix");
    int high=sc.nextInt();
    int arr2[][]=new int[low][high];
    int result[][]=new int[low][high];
    System.out.println("enter the A matrix elements:");
    for(int i=0;i<row;i++)
      for(int j=0;j<col;j++){
        arr1[i][j]=sc.nextInt();
      }
    System.out.println("enter the B matrix elements:");
    for(int i=0;i<low;i++)
      for(int j=0;j<high;j++){
        arr2[i][j]=sc.nextInt();
      }
    if(row==low && col==high){
     for(int i=0;i<low;i++){
      for(int j=0;j<high;j++){
        result[i][j]=arr1[i][j]+arr2[i][j];
       }
      }
    }
    for (int i = 0; i <low; i++){
      for(int j=0;j<high;j++)
        System.out.print(result[i][j]+" ");
      System.out.println();
    }
    
  }
}

