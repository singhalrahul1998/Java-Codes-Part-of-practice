import java.util.*;
class ChefCup
{
 public static void main(String wdfkjh[])
  {
      Scanner obj = new Scanner(System.in) ;
      int n=obj.nextInt();
      int a[][]=new int [n][2]; 
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<2;j++)
        {
           a[i][j]=obj.nextInt();
        }
      }
      for(int i=0;i<n;i++)
      {
      int x1;
      x1 = ((a[i][0]+a[i][1])+a[i][0]*a[i][1])/3;
      System.out.println(x1*(a[i][0]-x1)*(a[i][1]-x1));
      }
  }
}