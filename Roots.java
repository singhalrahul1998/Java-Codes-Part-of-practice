import java.util.*;
import java.math.*;
import java.text.*;
class Roots
{
  public static void main(String dsfvb[])
  {
    Scanner obj1 = new Scanner(System.in);
    Scanner obj2 = new Scanner(System.in);
    Scanner obj3 = new Scanner(System.in);
    int  a,b,c;
    a=obj1.nextInt();
    b=obj1.nextInt();
    c=obj1.nextInt();
    double x1,x2;
    int d=b*b-4*a*c;  
    x1= (Math.sqrt(d)-b)/(2*a);
    x2= (-b-Math.sqrt(d))/(2*a);
   // System.out.printf("%0.6d\n",x1);
   // System.out.printf("%0.6d\n",x2);
   DecimalFormat df = new DecimalFormat("#.######");
   
System.out.println(df.format(x1));System.out.println(df.format(x2));
  }
}