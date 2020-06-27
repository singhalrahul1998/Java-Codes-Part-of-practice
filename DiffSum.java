import java.util.*;
class DiffSum
{
 public static void main(String sdfg[])
 {
   Scanner obj1 = new Scanner(System.in);
   //Scanner obj2 = new Scanner(System.in);
   //int a,b;
   //a=obj1.nextInt();
  // b=obj2.nextInt();
  int a[] = new int [2];
  for(int i=0;i<2;i++)
  {
     a[i]=obj1.nextInt();
  }
   if(a[0]>a[1])
   {
      System.out.println(a[0]-a[1]);
   }
   else
      System.out.println(a[1]+a[0]);
 }
}