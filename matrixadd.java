/*
2
2
1 2 3 4
2
2 
5 6 7 8
after addition of matrix
6 8 
10 12
*/
import java.util.*;
public class matrixadd {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr1[i][j]=sc.nextInt();
      }
    }
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int arr2[][]=new int[r1][c1];
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++)
      {
        arr2[i][j]=sc.nextInt();
      }
    }
    System.out.println("after addition of matrix");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr1[i][j]+arr2[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}