import java.util.*;
class Revenue
{
  public static void main(String arr[])
  {
    Scanner obj = new Scanner(System.in);
    int N=obj.nextInt();
    int a[]=new int [N];
    int count=0;
     for(int i=0;i<N;i++)
       {
          a[i]=obj.nextInt();
       }
    for(int i=0;i<N;i++)
     {   
         for(int j=i;j<N;j++)
         {
           if(a[i]>a[j])
            {
               count=count+(a[i]-a[j]);
            }   
           else
               count=count+(a[j]-a[i]);
         }
     }
    System.out.println(count);
  }
}