import java.util.*;
class VarCount
{
  public static void main(String sxdf[])
  {
    Scanner obj = new Scanner(System.in);
    int n;
    int k;
    int count=0;
    n=obj.nextInt();
    k=obj.nextInt();
    int a[] = new int [n];
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if((a[i]-a[j])>=0)
        {
           if((a[i]-a[j])>=k)
            count++;
        }
        else
        {
          if((a[j]-a[i])>=k)
          count++;
        }
      }
    }
    System.out.println(count); 
  }
}