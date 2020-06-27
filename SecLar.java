import java.util.*;
class SecLar
{
 public static void main(String d[])
 {
   Scanner obj = new Scanner(System.in);
   int n=obj.nextInt();
   int a[][]= new  int [n][3];
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<3;j++)
       {
          a[i][j]=obj.nextInt();
       }
   }
   for(int i=0;i<n;i++)
   {
     //int temp;
           if (a[i][0] > a[i][1]) {
      int temp = a[i][0];
      a[i][0] = a[i][1];
      a[i][1] = temp;
    }

    if (a[i][1] > a[i][2]) {
      int temp = a[i][2];
      a[i][1] = a[i][2];
      a[i][2] = temp;
    }

    if (a[i][0] > a[i][1]) {
      int temp = a[i][0];
      a[i][0] = a[i][1];
      a[i][1] = temp;
    }
      
   System.out.println(a[i][1]);
   }
 }
}