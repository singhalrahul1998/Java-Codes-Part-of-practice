import java.util.*;
class FactTest
{
  public static void main(String arr[])
  {try{
    Scanner obj = new Scanner(System.in);
    int N=obj.nextInt();
    int a[] = new int [N];
    int i,j;
    int f;
    for(i=0;i<N;i++)
    {
      a[i]=obj.nextInt();
    }
    for(i=0;i<N;i++)
    { f=1;
      for(j=1;j<=a[i];j++)
      { 
        f=f*j;
      }
      System.out.println(f);
    }
   }catch(Exception e)
    {
       return;
    }
  }
}