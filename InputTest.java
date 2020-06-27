import java.util.*;
class InputTest
{
 public static void main(String ffghjk[])
 {
   Scanner obj = new Scanner(System.in);
   int a[]=new int [2];
   int count=0;
   for(int i=0;i<2;i++)
   {
     a[i]=obj.nextInt();
   }
   int b[]=new int[a[0]];
   for(int j=0;j<a[0];j++)
   {
     b[j]=obj.nextInt();
   }
   for(int k=0;k<a[0];k++)
   {
     if((b[k]%a[1])==0)
       count++;
   }
   System.out.println(count);
 }
}