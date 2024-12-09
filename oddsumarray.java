/*
10
1 
10
28
55
*/
import java.util.*;
class oddsumarray{
  public static void main(String args[])
  {
    Scanner v=new Scanner(System.in);
    int n=v.nextInt();
    int ns[]=new int[n];
    int k=0,s=0;
    for(int i=1;i<=n;i++){
        s+=i;
        ns[k]=s;
        k++;
    }
    for(int i=0;i<n;i+=3){
         System.out.println((ns[i]+" "));
    }
   
  }
}