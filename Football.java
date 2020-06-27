import java.util.*;
class Football
{
  public static void main(String vbfg[])
  {
     Scanner obj = new Scanner(System.in);
     int t = obj.nextInt();
     //int a[] = new int[t];
     for(int i=0;i<t;i++)
      {
        int a=obj.nextInt();
        String b[] = new String[a];
        String m,n="";
        for(int j=0;j<a;j++)
          {
              b[j]=obj.next();
          }
          m=b[0];
         for(int k=1;k<a;k++)
           {
               if(b[0]!=b[k])
                   n=b[k];
                  //continue;
               //else
               // { n=b[k];
               //     break;
                // }
           }
          int c1=0,c2=0;
          for(int p=0;p<a;p++)
           {
               if(b[p]==m)
                  c1++;
               else
                  c2++;
           }
          if(c1==c2)
            {System.out.println("Draw");}
           else
            {
                if(c1>c2)
                 {System.out.println(m);}
                else
                 {System.out.println(n);}
            }
      }

  }
}