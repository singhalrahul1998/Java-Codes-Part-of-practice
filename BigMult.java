import java.util.*;
import java.math.*;
//import java.io.*;
class BigMult
{
  public static void main(String dafgb[])
 {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
   //InputStreamReader r=new InputStreamReader(System.in);    
    //BufferedReader br=new BufferedReader(t);
    //int n= obj.nextInt();
    String a,b;
    for(int i=0;i<n;i++)
    {  a=obj.next();
       b=obj.next();
       BigInteger p=new BigInteger(a);
       BigInteger q=new BigInteger(b);
       BigInteger r=p.multiply(q);
       BigInteger s = new BigInteger("3");
       System.out.println(r.remainder(s));
    }    
 }
}