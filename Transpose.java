import java.util.*;
class Transpose
{
  public static void main(String aguv[])
 {
  int a[][]=new int [3][3];
  int c[][]=new int [3][3];
  int i=0;
  int j=0;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the elements of martrix");
  for( i=0;i<3;i++)
   {
     for( j=0;j<3;j++)
      {
        a[i][j]=obj.nextInt();
      }
   }
   for( i=0;i<3;i++)
   { 
     for( j=0;j<3;j++)
      {
        c[i][j]=a[j][i];
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

