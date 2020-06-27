import java.util.*;
class ATM
{
 public static void main(String ghhjkl[])
 {
  Scanner obj=new Scanner(System.in);
     double a=obj.nextInt();
     double b=obj.nextDouble();
     if(a<(b-0.50))
      {
         if(a%5==0)
         {System.out.println(b-a-0.50);}
         else 
          System.out.println(b);
      }
     else
      System.out.println(b);
 }
}