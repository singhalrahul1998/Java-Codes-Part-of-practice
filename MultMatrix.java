import java.util.*;
class MultMatrix
{ 
 public static void main(String aguv[])
 {
  int a[][]=new int [3][3];
  int b[][]=new int [3][3];
  int c[][]=new int [3][3];
  int i=0;
  int j=0;
  int k=0;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the elements of martrix");
  for( i=0;i<3;i++)
   {
     for( j=0;j<3;j++)
      {
        a[i][j]=obj.nextInt();
      }
   }
   for( j=0;j<3;j++)
   {
     for( k=0;k<3;k++)
      {
        b[j][k]=obj.nextInt();
      }
   }
  for(i=0;i<3;i++)
   {
     for(j=0;j<3;j++)
     {
       c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
     }
   }
   for( i=0;i<3;i++)
   {
     for( j=0;j<3;j++)
      {
        System.out.print("  "+c[i][j]);
      }
       System.out.println( );
 
   }
   
 }
}
