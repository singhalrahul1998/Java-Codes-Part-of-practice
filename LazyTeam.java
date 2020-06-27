import java.util.*;
import java.math.*;
class LazyTeam
{
 public static void main(String sdsfg[])
 {  

    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    for(int i=0;i<t;i++)
    {
      int n = obj.nextInt();
      if(n<=1000000)
     {
      int r = obj.nextInt();
      int a[] = new int[n];
      int  j=0;
       for( j=0;j<n;j++)
        {
           a[j]=obj.nextInt();
        }
      System.out.print(n);
      int count=0;
      for( j=0;j<n;j++)
       {
          if(a[j]<=r)
           count++;
       }
      System.out.print(" ");
      System.out.print(count);
      
      System.out.print(" ");
      System.out.print(count);
     }
    }
 }
}