import java.util.*;
class SmallFactorial
{
   public static void main(String defdgvhbjk[])
  {
      Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       int a[] = new int [n];
       int i,k=1,f=1;
       for(i=0;i<n;i++)
       {
           a[i]=obj.nextInt();
       }
       for(i=0;i<n;i++)
       {
           for(k=1;k<=a[i];k++)
           { 
             f=f*k;
              
           }
             System.out.println(f);
             f=1;
       }
  }
}