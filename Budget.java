import java.util.*;
class Budget
{
  public static void main(String arr[])
  {
    Scanner obj = new Scanner(System.in);
    int N=obj.nextInt();
    Long a[]=new Long [N];
     for(int i=0;i<N;i++)
       {
          a[i]=obj.nextLong();
       }
    for(int i=0;i<N;i++)
     {   
         for(int j=i;j<N;j++)
         {
           if(a[i]>a[j])
            {
               Long term=a[i];
                a[i]=a[j];
                a[j]=term;
            }
         }
     }
    Long b[]=new Long [N];
      for(int i=0;i<N;i++)
      {
         b[i]=a[i]*(N-i);
      }
    for(int i=0;i<N;i++)
     {   
         for(int j=i;j<N;j++)
         {
           if(b[i]>b[j])
            {
               Long term=b[i];
                b[i]=b[j];
                b[j]=term;
            }
         }
     }
     System.out.println(b[N-1]);
  }
}