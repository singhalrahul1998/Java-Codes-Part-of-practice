import java.util.*;
class Atm5
{
 public static void main(String xsdc[])
 { Scanner obj = new Scanner(System.in);
   int t=obj.nextInt();
   for(int i=0;i<t;i++)
      {
        int n=obj.nextInt();
        int k=obj.nextInt();
        int a[] = new int[n];
        for(int g=0;g<n;g++)
           {
              a[g]=obj.nextInt();
           //}
        //for(int g=0;g<n;g++)
        //   {
              if(a[g]<=k)
                 {
                    System.out.print("1");
                    k=k-a[g];
                 }
              else
                    System.out.print("0");
          }
        System.out.println("");
      }
 }
}