/*
5 
1 3 5 7 9
[9, 16, 21, 24, 25]*/
import java.util.*;
class postfixarray{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=n;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
    int post[]=new int[m];
    post[0]=arr[(n-1)];
    m--;
    for(int i=1;i<n;i++){
        m--;
        post[i]=post[(i-1)]+arr[m];  
    }
    System.out.println(Arrays.toString(post));
  }   
}