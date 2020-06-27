import java.util.*;
class TwoVsTen
{
  public static void main(String sadvf[])
  {
    Scanner obj = new Scanner(System.in);
    int N=obj.nextInt();
    int count=0;
    int a[] = new int [N];
    for(int i=0;i<N;i++)
     {
       a[i] = obj.nextInt();
     }
    for(int i=0;i<N;i++)
     {
       if((a[i]%10)==0)
        System.out.println(0);
        else
       if((a[i]%10)==5)
        System.out.println(1);
        else
        System.out.println(-1);
     }
      
  }
}