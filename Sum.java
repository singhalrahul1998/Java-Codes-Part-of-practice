import java.util.*;
class Sum
{
  public static void main(String sdf[])
   {Scanner obj = new Scanner(System.in);
   int n=obj.nextInt();
   int a[] = new int [n];
   int sum;
    for(int i=0;i<n;i++)
    {
       a[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++)
     { sum=0;
       { while(a[i]>0)
          {
              sum=sum+(a[i]%10);
              a[i]= a[i]/10;
          } 
       }
        System.out.println(sum);
    }}
}