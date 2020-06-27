import java.util.*;
class MagicSet
{
 public static void main(String dssfdg[])
  {
    Scanner obj = new Scanner(System.in);
    int t=obj.nextInt();
    int n,m;
    int count=0,sum=0;
    int a[] = new int [n];
    for(int i=0;i<2;i++)
    {
      n=obj.nextInt();
      m=obj.nextInt();
    }
    for(int i=0;i<n;i++)
    { 
      a[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++)
    {
       for(int j=i+1;j<n;j++)
       {
          sum=a[i]+a[j];
          if(sum%m==0)
          {
             count++;
          }
       }
    }
    
    
  }
}