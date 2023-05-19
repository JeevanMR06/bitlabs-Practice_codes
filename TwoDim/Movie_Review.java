import java.util.Scanner;
public class Movie_Review {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of 2D array size: ");
    int review = sc.nextInt();
    int movie = sc.nextInt();
    int arr[][] = new int[review][movie];
    System.out.println("Enter the movie ratings: ");
    for(int i=0;i<review;i++){
      for(int j=0;j<movie;j++){
        arr[i][j]=sc.nextInt();
  }
}
    System.out.println("The movie ratings are: ");
    for(int i=0; i<review; i++){
      for(int j=0; j<movie; j++){
        System.out.print(arr[i][j]+ " ");
      }
      System.out.println();
  }
      for(int i=0;i<review;i++){
        int sum=0, average=0;
      for(int j=0;j<movie;j++){
        sum = sum + arr[i][j];
      }
     average = sum/3;
    System.out.println(" Average rating of" +movie+ "is "+average);
      }
     int max=arr[0][1];
        for(int i=1;i<arr.length;i++){
          if(max<arr[i][1])
            max = arr[i][1];
        }
    System.out.println("max review of movie1 is "+max);
  }
}
