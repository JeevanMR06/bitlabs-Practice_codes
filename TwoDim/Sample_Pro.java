import java.util.Scanner;
public class TwoDim1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int arr[][]= new int[3][4];
    System.out.println("enter the array elements");
    for(int i=0;i<3;i++)
      for(int j=0;j<4;j++)
        arr[i][j]=sc.nextInt();
    
 
    System.out.println("the array elements are");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
    }
    System.out.println(arr.length); //no.of rows
    System.out.println(arr[0].length); //no.of elements in each row
 
    System.out.println(arr[0]);
    
  }
 
  
}
 
// length
 
//int arr[]= new int[3];
//arr.length


//find average rating and max review for movie1.
/*import java.util.Scanner;
public class Movie_Review_Array{
  public static void main(String[] args){
    Movie_Review mr = new Movie_Review();
    mr.findAvgRating();
      }
}
class Movie_Review{
  public void findAvgRating(){
    Scanner sc = new Scanner(System.in);
    double sum=0,average;
    int review[][] = new int[3][4];
    System.out.println("enter array elements");
    for(int i=0;i<review.length;i++)
      for(int j=0;j<review[i].length;j++)
        review[i][j] = sc.nextInt();
    for(int i=0;i<review.length;i++){
      for(int j=0;j<review[i].length;j++)
        System.out.print(review[i][j]);
      System.out.println();
    }
     
    for(int i=0;i<review.length;i++)
      for(int j=0;j<review[i].length;j++)
        sum = sum+review[i][j];
    average = sum/12;
    System.out.println(" Average rating is "+average);
     
    int max=review[0][1];
        for(int i=1;i<review.length;i++){
          if(max<review[i][1])
            max = review[i][1];
        }
    System.out.println("max review of movie1 is "+max);
      }
}*/