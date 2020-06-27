import java.util.*;
import java.lang.*;
import java.io.*;
 class LOC
{
  public static void main(String sddgbg[]) throws java.lang.Exception
  {try{
     Scanner obj = new Scanner(System.in);
     int N = obj.nextInt();
     String a[]= new String [N];
     int count=0;
     for(int i=0;i<N;i++)
     { 
      a[i]=obj.next(); 
     }
     int Q = obj.nextInt();
     String s[][] = new String [4][Q];   
     for(int j=0;j<Q;j++)
   {
     for(int i=0;i<4;i++)
     {
       s[i][j]=obj.next(); 
     }
   }
     for(int j=0;j<Q;j++)
    {
     char p = s[3][j].charAt(0);
     for(int i=Integer.parseInt(s[0][j])-1;i<Integer.parseInt(s[1][j]);i++)
     {
       if(a[i].charAt(Integer.parseInt(s[2][j])-1)==p)
         count++;
     }
     System.out.println(count);
     count=0; 
    }
     }
      catch(Exception e)
       {
        return;
       }
  }
}