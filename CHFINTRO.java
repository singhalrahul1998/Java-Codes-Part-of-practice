import java.util.*;
class CHFINTRO
{
 public static void main(String dvx[])
 { try{
   Scanner obj = new Scanner(System.in);
   int n=obj.nextInt();
   int r=obj.nextInt();
   int a[] = new int[n];
   for(int i=0;i<n;i++)
   {
     a[i]=obj.nextInt();
   }
   for(int i=0;i<n;i++)
   {
     if(a[i]>=r)
      System.out.println("Good boi");
     else
      System.out.println("Bad boi");
   }}catch(Exception e)
     {return;}
 }
 
}