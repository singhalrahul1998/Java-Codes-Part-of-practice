import java.util.*;
class AT
{
 public static void main(String dsf[])
  {
     Scanner obj = new Scanner(System.in);
     int N = obj.nextInt();
     int sum;
     int a[][] = new int [N][2];
     for(int i=0;i<N;i++)
      {
         for(int j=0;j<2;j++)
         {
            a[i][j]=obj.nextInt();
         }
      }
      for(int i=0;i<N;i++)
      { sum=0;
        sum=a[i][0]+a[i][1]; 
        System.out.println(sum);
      }
      
  }
}