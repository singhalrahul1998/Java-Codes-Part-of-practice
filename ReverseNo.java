import java.util.*;
class ReverseNo
{
  public static void main(String fdgf[])
  {
    Scanner obj = new Scanner(System.in);
    int t=obj.nextInt();
    while(t>0)
    { t--;
       int a=0;
      int n=obj.nextInt();
     while(n>0)
      { 
        a=a*10+(n%10);
        n=n/10;
      }
      System.out.println(a);
    }
  }
}