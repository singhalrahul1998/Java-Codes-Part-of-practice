import java.util.*;
class SpellBob
{
  public static void main(String gscvjd[])
  {
    Scanner obj = new Scanner(System.in);
    int  t=obj.nextInt();
    String s1[] = new String [t];
    String s2[] = new String [t];
    for(int i=0;i<t;i++)
    {
       s1[i]=obj.next();
    }
    for(int i=0;i<t;i++)
    {
       s2[i]=obj.next();
    }
    for(int i=0;i<t;i++)
    {
       if((s1[i].charAt(0)=='b')||(s2[i].charAt(0)=='b'))
        {
          if((s1[i].charAt(1)=='o')||(s2[i].charAt(1)=='o'))
           {
             if((s1[i].charAt(2)=='b')||(s2[i].charAt(2)=='b'))
               System.out.println("yes");
           else
            System.out.println("no");
           }
           else
            System.out.println("no");
        }
       else
        {
          System.out.println("no");
        }
    } 
  }
}