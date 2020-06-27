import java.util.*;
class DOI
{
  public static void main(String fddbg[])
  {
    Scanner obj = new Scanner(System.in);
    int N=obj.nextInt();
    if((N%4)==0)
     {  N++;
      System.out.println(N);}
     else
     {N--;
       System.out.println(N);}
  }
}