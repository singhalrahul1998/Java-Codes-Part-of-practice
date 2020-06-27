import java.util.*;
class Editor
{
  public static void main(String dfg[])
  {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int a[] = new int [n];
    int b[] = new int [n];
    String S = "";
  //  StringBuffer obj1 = new StringBuffer(S);
    String s[] = new String [n];
    String k[] = new String [n];
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
      if(a[i]==1)
        {
           s[i]=obj.next();
           b[i]=0;
        }
      if(a[i]==2)
        {  s[i]="";
           b[i]=obj.nextInt();
        }
      if(a[i]==3)
        {  s[i]="";
           b[i]=obj.nextInt();
        }
      if(a[i]==4)
        {
         b[i]=0;  s[i]="";
        }
    }

    for(int i=0;i<n;i++)
    {
      switch(a[i])
      {
        case 1 : S=S+s[i];
        case 2 :  for(int p=0;p<n;p++)
                     {
                       k[i]=S.substring(S.length()-b[i]);
                     }
                 S=S.substring(0,S.length()-b[i]);
                 //S=S - k[i];
        case 3 : System.out.println(S.charAt(b[i]-1));
        case 4 : for(int j=i-1;j>=0;j--)
                  {
                     if(a[j]==1)
			{//S= S-s[j];
                         S=S.substring(S.length()-s[j].length());
                      break;}
                     if(a[j]==2)
			{S=S+k[j];
                      break;}
                  }
      }
    }
  }
}